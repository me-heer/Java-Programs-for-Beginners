#include <iostream>
using namespace std;

class Player
{
private:
    char pname[20];
    int innings;
    int score;
    float avg;
public:
    void getData();
    void putData(Player []);
    void sortData(int s,Player []);
    void Swap(Player *,Player *);
};


void Player::getData()
{
    cout << "Enter the following details: " << endl;
    cout << "Player Name: "; cin >> pname;
    cout << "Number of Innings: "; cin >> innings;
    cout << "Score: "; cin >> score;
}

void Player::putData(Player p[])
{
        cout.width(20); cout << "Name";
        cout.width(20); cout << "Innings";
        cout.width(20); cout << "Score";
        cout.width(20); cout << "Average" << endl;
    for(int i=0;i<3;i++)
    {
        cout.width(20); cout << p[i].pname;
        cout.width(20); cout << p[i].innings;
        cout.width(20); cout << p[i].score;
        cout.width(20); cout << p[i].avg << endl;
    }
}

void Player::sortData(int s,Player p[])
{
    for(int i=0;i<3;i++)
        for(int j=i+1;j<3;j++)
        {
            if(p[i].pname[0] > p[j].pname[0] && s==1)
                Swap(&p[i],&p[j]);
            if(p[i].innings < p[j].innings && s==2)
                Swap(&p[i],&p[j]);
            if(p[i].score < p[j].score && s==3)
                Swap(&p[i],&p[j]);
            if(p[i].avg > p[j].avg && s==4)
                Swap(&p[i],&p[j]);
        }
    p[0].putData(p);
}


void Player::Swap(Player *p1, Player *p2)
{
    Player temp;
    temp = *p1;
    *p1 = *p2;
    *p2 = temp;
}
int main()
{
    int i;
    Player p[3];
    for(int i=0;i<3;i++)
        p[i].getData();
    cout << "Enter the following digit to sort accordingly: " << endl;
    cout << "1. To sort according to Player Name." << endl;
    cout << "2. To sort according to Number of Innings." << endl;
        cout << "3. To sort according to Score." << endl;
    cout << "4. To sort according to Batting Average." << endl;
    cin >> i;
    switch(i)
    {
        case 1: p[0].sortData(1,p); break;
        case 2: p[0].sortData(2,p); break;
        case 3: p[0].sortData(3,p); break;
        case 4: p[0].sortData(4,p); break;
    }
}
