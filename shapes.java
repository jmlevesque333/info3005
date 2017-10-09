#include <string>
#include <iostream>
#include <cmath>


float pi = 3.14159265359;

class figureGeo
{
protected:
    int dimension;
};

class figure2D: public figureGeo
{
public:
    virtual void set(int base, int hauteur)
    {
        this->base = base;
        this->hauteur = hauteur;
    }
protected:
    int base;
    int hauteur;
};

class figure3D: public figure2D
{
public:
    virtual void set(int base, int hauteur, int longeur)
    {
        this->base = base;
        this->hauteur = hauteur;
        this->longeur = longeur;
    }
protected:
    int longeur;
};

class rectangle: public figure2D
{
public:
    int perimetre()
    {
        return base*2 + hauteur*2;
    }
    int aire()
    {
        return base*hauteur;
    }

};

class carre: public figure2D
{
public:
    void set(int base)
    {
        this->base = base;
    }
    int perimetre()
    {
        return base*4;
    }
    int aire()
    {
        return base*base;
    }
    int diagonale()
    {
        return base*sqrt(2);
    }
};

class parallelogramme: public figure2D
{
public:
    void set(int base, int hauteur)
    {
        this->base = base;
        this->hauteur = hauteur;
    }
    int aire()
    {
        return base*hauteur;
    }
};

class trapeze: public figure2D
{
public:
    void set(int grandeBase, int petiteBase, int hauteur)
    {
        this->grandeBase = grandeBase;
        this->petiteBase = petiteBase;
        this->hauteur = hauteur;
    }
    float aire()
    {
        return ((petiteBase + grandeBase) * hauteur)/2;
    }
protected:
    int petiteBase;
    int grandeBase;
};

class triangle: public figure2D
{
public:
    int aire()
    {
        return base*hauteur/2; 
    }
};

class triangleEq: public figure2D
{
public:
    void set(int base)
    {
        this->base = base;
    }
    int perimetre()
    {
        return base*3;
    }
    float hauteur()
    {
        return base*sqrt(3)/4;
    }
    virtual float aire()
    {
        return (base*base)*sqrt(3)/4;
    }
};

class triangleRecIso: public triangleEq
{
public:
    int hypothenuse()
    {
        return base*sqrt(2);
    }
    int hauteur()
    {
        return base/sqrt(2);
    }
    float aire()
    {
        return base*base/2;
    }
};

class cercle: public figure2D
{
public:
    virtual void set(int rayon)
    {
        this->rayon = rayon;
    }
    float perimetre()
    {
        return 2*pi*rayon;
    }
    float aire()
    {
        return pi*rayon*rayon;
    }
protected:
    int rayon;
};

class secteurAngle: public cercle
{
public:
    void set(int rayon, int radiant)
    {
        this->rayon = rayon;
        this->radiant = radiant;
    }
    float longeur()
    {
        return rayon*radiant;
    }
    float aire()
    {
        return radiant*rayon*rayon/2;
    }
protected:
    float radiant;
};

class parallelepipede: public figure3D
{
public:
    int volume()
    {
        return base*hauteur*longeur;
    }
};

class sphere: public figure3D
{
public:
    void set(int rayon)
    {
        this->rayon = rayon;
    }
    int volume()
    {
        return (4/3)*pi*rayon*rayon*rayon;
    }
protected:
    int rayon;
};

class coneDeRevolution: public figure3D
{
public:
    void set(int rayon, int hauteur)
    {
        this->rayon = rayon;   
        this->hauteur = hauteur;
    }
    int volume()
    {
        return pi*rayon*rayon*hauteur/3;
    }
protected:
    int hauteur;
    int rayon;
};

class pyramideBaseRect: public figure3D
{
public:
    int volume()
    {
        return base*hauteur*longeur/3;
    }
};
class pyramideBaseTrian: public figure3D
{
public:
    int volume()
    {
        return base*hauteur*longeur/6;
    }

};

int main()
{
    carre nouveauCarre;
    nouveauCarre.set(5);
    cout << "carre:" << endl;
    cout << "aire:" << nouveauCarre.aire() << endl;
    cout << "perimetre:" << nouveauCarre.perimetre() << endl;
    cout << "diagonale:" << nouveauCarre.diagonale() << endl << endl;

    rectangle nouveauRectangle;
    nouveauRectangle.set(5, 4);
    cout << "rectangle:" << endl;
    cout << "aire:" << nouveauRectangle.aire() << endl;
    cout << "perimetre:" << nouveauRectangle.perimetre() << endl << endl;

    parallelogramme nouveauParallelogramme;
    nouveauParallelogramme.set(5, 6);
    cout << "parallelogramme:" << endl;
    cout << "aire:" << nouveauParallelogramme.aire() << endl << endl;

    trapeze nouveauTrapeze;
    nouveauTrapeze.set(6,3,8);
    cout << "trapeze:" << endl;
    cout << "aire:" << nouveauTrapeze.aire() << endl << endl;

    triangle nouveauTriangle;
    nouveauTriangle.set(9,5);
    cout << "triangle:" << endl;
    cout << "aire:" << nouveauTriangle.aire() << endl << endl ;

    triangleEq nouveauTriangleEq;
    nouveauTriangleEq.set(4);
    cout << "triangleEq:" << endl;
    cout << "aire:" << nouveauTriangleEq.aire() << endl;
    cout << "perimetre:" << nouveauTriangleEq.perimetre() << endl;
    cout << "hauteur:" << nouveauTriangleEq.hauteur() << endl << endl;

    triangleRecIso nouveauTriangleRecIso;
    nouveauTriangleRecIso.set(9);
    cout << "triangleEq:" << endl;
    cout << "aire:" << nouveauTriangleRecIso.aire() << endl;
    cout << "hypothenuse:" << nouveauTriangleRecIso.hypothenuse() << endl;
    cout << "hauteur:" << nouveauTriangleRecIso.hauteur() << endl << endl;

    cercle nouveauCercle;
    nouveauCercle.set(6);
    cout << "cercle:" << endl;
    cout << "aire:" << nouveauCercle.aire() << endl;
    cout << "perimetre:" << nouveauCercle.perimetre() << endl << endl;

    secteurAngle nouveauSecteurAngle;
    nouveauSecteurAngle.set(9, 2*pi);
    cout << "secteurAngle:" << endl;
    cout << "aire:" << nouveauSecteurAngle.aire() << endl;
    cout << "longeur:" << nouveauSecteurAngle.longeur() << endl << endl;

    parallelepipede nouveauParallelepipede;
    nouveauParallelepipede.set(9, 5, 8);
    cout << "parallelepipede" << endl;
    cout << "volume:" << nouveauParallelepipede.volume() << endl << endl;

    sphere nouveauSphere;
    nouveauSphere.set(6);
    cout << "sphere:" << endl;
    cout << "volume:" << nouveauSphere.volume() << endl << endl;

    coneDeRevolution nouveauConeDeRevolution;
    nouveauConeDeRevolution.set(3, 6);
    cout << "coneDeRevolution:" << endl;
    cout << "volume:" << nouveauConeDeRevolution.volume() << endl << endl;

    pyramideBaseRect nouveauPyramideBaseRect;
    nouveauPyramideBaseRect.set(3, 6, 4);
    cout << "pyramideBaseRect:" << endl;
    cout << "volume:" << nouveauPyramideBaseRect.volume() << endl << endl;

    pyramideBaseTrian nouveauPyramideBaseTrian;
    nouveauPyramideBaseTrian.set(3, 6, 9);
    cout << "pyramideBaseRect:" << endl;
    cout << "volume:" << nouveauPyramideBaseTrian.volume() << endl << endl;

    return 0;
}
