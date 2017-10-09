using System;

public class globals
{
    public static double pi = 3.14159265359;
}

public class figure2D
{
    public int b {protected get; set;}
    public int hauteur {protected get; set;}
}

public class figure3D: figure2D
{
    public int longeur {protected get; set;}
}

public class rectangle: figure2D
{
    public int perimetre()
    {
        return b*2 + hauteur*2;
    }
    public int aire()
    {
        return b*hauteur;
    }
}

public class carre: figure2D
{
    public int perimetre()
    {
        return b*4;
    }
    public int aire()
    {
        return b*b;
    }
    public double diagonale()
    {
        return b*System.Math.Sqrt(2);
    }
}

public class parallelogramme: figure2D
{
    public int aire()
    {
        return b*hauteur;
    }
}

public class trapeze: figure2D
{
    public int petiteB {protected get; set;}
    public int grandeB {protected get; set;}
    public double aire()
    {
        return ((petiteB + grandeB) * hauteur)/2;
    }
}

public class triangle: figure2D
{
    public int aire()
    {
        return b*hauteur/2; 
    }
}

public class triangleEq: figure2D
{
    public int perimetre()
    {
        return b*3;
    }
    public double h()
    {
        return b*System.Math.Sqrt(3)/4;
    }
    public double aire()
    {
        return (b*b)*System.Math.Sqrt(3)/4;
    }
}

public class triangleRecIso: figure2D
{
    public double hypothenuse()
    {
        return b*System.Math.Sqrt(2);
    }
    public double h()
    {
        return b/System.Math.Sqrt(2);
    }
    public double aire()
    {
        return b*b/2;
    }
}

public class cercle: figure2D
{
    public int rayon {protected get; set;}
    public double perimetre()
    {
        return 2*globals.pi*rayon;
    }
    public double aire()
    {
        return globals.pi*rayon*rayon;
    }
}

public class secteurAngle: figure2D
{
    public int rayon {protected get; set;}
    public double radiant {protected get; set;}
    public double longeur()
    {
        return rayon*radiant;
    }
    public double aire()
    {
        return radiant*rayon*rayon/2;
    }
}

public class parallelepipede: figure3D
{
    public int volume()
    {
        return b*hauteur*longeur;
    }
}

public class sphere: figure3D
{
    public int rayon {protected get; set;}
    public double volume()
    {
        return (4/3)*globals.pi*rayon*rayon*rayon;
    }
}

public class coneDeRevolution: figure3D
{
    public int rayon {protected get; set;}
    public double volume()
    {
        return globals.pi*rayon*rayon*hauteur/3;
    }
}

public class pyramideBaseRect: figure3D
{
    public double volume()
    {
        return b*hauteur*longeur/3;
    }
}

public class pyramideBaseTrian: figure3D
{
    public double volume()
    {
        return b*hauteur*longeur/6;
    }
}

public class shapes
{
    public static void Main()
    {
        carre nouveauCarre = new carre();
        nouveauCarre.b = 5;
        Console.WriteLine(
        "carre:\n aire:{0}\t perimetre:{1}\t diagonale:{2}\t\t", nouveauCarre.aire(), nouveauCarre.perimetre(), nouveauCarre.diagonale());

        rectangle nouveauRectangle = new rectangle();
        nouveauRectangle.b = 5;
        nouveauRectangle.hauteur = 4;
        Console.WriteLine(
        "rectangle:\n aire:{0}\t perimetre:{1}\t\t", nouveauCarre.aire(), nouveauCarre.perimetre());

        parallelogramme nouveauParallelogramme = new parallelogramme();
        nouveauParallelogramme.b = 5;
        nouveauParallelogramme.hauteur = 6;
        Console.WriteLine(
        "rectangle:\n aire:{0}\t\t", nouveauCarre.aire());

        trapeze nouveauTrapeze = new trapeze();
        nouveauTrapeze.petiteB = 6;
        nouveauTrapeze.grandeB = 3;
        nouveauTrapeze.hauteur = 8;
        Console.WriteLine(
        "rectangle:\n aire:{0}\t\t", nouveauTrapeze.aire());

        triangle nouveauTriangle = new triangle();
        nouveauTriangle.b = 9;
        nouveauTriangle.hauteur = 5;
        Console.WriteLine(
        "triangle:\n aire:{0}\t\t", nouveauTriangle.aire());

        triangleEq nouveauTriangleEq = new triangleEq();
        nouveauTriangleEq.b = 4;
        Console.WriteLine(
        "triangleEq:\n aire:{0}\t perimetre:{1}\t hauteur:{2}\t\t", nouveauTriangleEq.aire(), nouveauTriangleEq.perimetre(), nouveauTriangleEq.h());

        triangleRecIso nouveauTriangleRecIso = new triangleRecIso();
        nouveauTriangleRecIso.b = 9;
        Console.WriteLine(
        "triangleRecIso:\n aire:{0}\t hypothenuse:{1}\t hauteur:{2}\t\t", nouveauTriangleRecIso.aire(), nouveauTriangleRecIso.hypothenuse(), nouveauTriangleRecIso.h());

        cercle nouveauCercle = new cercle();
        nouveauCercle.rayon = 6;
        Console.WriteLine(
        "cercle:\n aire:{0}\t perimetre:{1}\t\t", nouveauCercle.aire(), nouveauCercle.perimetre());

        secteurAngle nouveauSecteurAngle = new secteurAngle();
        nouveauSecteurAngle.rayon = 9;
        nouveauSecteurAngle.radiant = 2*globals.pi;
        Console.WriteLine(
        "secteurAngle:\n aire:{0}\t longeur:{1}\t\t", nouveauSecteurAngle.aire(), nouveauSecteurAngle.longeur());

        parallelepipede nouveauParallelepipede = new parallelepipede();
        nouveauParallelepipede.b = 9;
        nouveauParallelepipede.hauteur = 5;
        nouveauParallelepipede.longeur =  8;
        Console.WriteLine(
        "parallelepipede:\n volume:{0}\t\t", nouveauParallelepipede.volume());
        
        sphere nouveauSphere = new sphere();
        nouveauSphere.rayon = 6;
        Console.WriteLine(
        "sphere:\n volume:{0}\t\t", nouveauSphere.volume());

        coneDeRevolution nouveauConeDeRevolution = new coneDeRevolution();
        nouveauConeDeRevolution.rayon = 3;
        nouveauConeDeRevolution.hauteur = 6;
        Console.WriteLine(
        "coneDeRevolution:\n volume:{0}\t\t", nouveauConeDeRevolution.volume());

        pyramideBaseRect nouveauPyramideBaseRect = new pyramideBaseRect();
        nouveauPyramideBaseRect.b = 3;
        nouveauPyramideBaseRect.hauteur = 6;
        nouveauPyramideBaseRect.longeur = 4;
        Console.WriteLine(
        "pyramideBaseRect:\n volume:{0}\t\t", nouveauPyramideBaseRect.volume());

        pyramideBaseTrian nouveauPyramideBaseTrian = new pyramideBaseTrian();
        nouveauPyramideBaseTrian.b = 3;
        nouveauPyramideBaseTrian.hauteur = 6;
        nouveauPyramideBaseTrian.longeur = 9;
        Console.WriteLine(
        "pyramideBaseRect:\n volume:{0}\t\t", nouveauPyramideBaseTrian.volume());
    }
    
}
