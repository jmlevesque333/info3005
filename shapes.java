class Shapes
{
    class figure2D
    {
        void set(double h, double hauteur)
        {
            this.h = h;
            this.hauteur = hauteur;
        }
        public double h;
        protected double hauteur;
        double pi = 3.14159265359;
    }
    
    class figure3D extends figure2D
    {
        void set(double h, double hauteur, double longeur)
        {
            this.h = h;
            this.hauteur = hauteur;
            this.longeur = longeur;
        }
        protected double longeur;
    }
    
    class rectangle extends figure2D
    {
        double perimetre()
        {
            return h*2.0 + hauteur*2.0;
        }
        double aire()
        {
            return h*hauteur;
        }
    }
    
    class carre extends figure2D
    {
        void set(double h)
        {
            this.h = h;
        }
        double perimetre()
        {
            return h*4.0;
        }
        double aire()
        {
            return h*h;
        }
        double diagonale()
        {
            return h*Math.sqrt(2);
        }
    }
    
    class parallelogramme extends figure2D
    {
        void set(double h, double hauteur)
        {
            this.h = h;
            this.hauteur = hauteur;
        }
        double aire()
        {
            return h*hauteur;
        }
    }
    
    class trapeze extends figure2D
    {
        void set(double grandeh, double petiteh, double hauteur)
        {
            this.grandeh = grandeh;
            this.petiteh = petiteh;
            this.hauteur = hauteur;
        }
        double aire()
        {
            return ((petiteh + grandeh) * hauteur)/2.0;
        }
        protected double petiteh;
        protected double grandeh;
    }
    
    class triangle extends figure2D
    {
        double aire()
        {
            return h*hauteur/2.0; 
        }
    }
    
    class triangleEq extends figure2D
    {
        void set(double h)
        {
            this.h = h;
        }
        double perimetre()
        {
            return h*3.0;
        }
        double hauteur()
        {
            return h*Math.sqrt(3)/4.0;
        }
        double aire()
        {
            return (h*h)*Math.sqrt(3)/4.0;
        }
    }
    
    class triangleRecIso extends figure2D
    {
        void set(double h)
        {
            this.h = h;
        }
        double hypothenuse()
        {
            return h*Math.sqrt(2);
        }
        double hauteur()
        {
            return h/Math.sqrt(2);
        }
        double aire()
        {
            return h*h/2.0;
        }
    }
    
    class cercle extends figure2D
    {
        void set(double rayon)
        {
            this.rayon = rayon;
        }
        double perimetre()
        {
            return 2.0*pi*rayon;
        }
        double aire()
        {
            return pi*rayon*rayon;
        }
        protected double rayon;
    }
    
    class secteurAngle extends figure2D
    {
        void set(double rayon, double radiant)
        {
            this.rayon = rayon;
            this.radiant = radiant;
        }
        double longeur()
        {
            return rayon*radiant;
        }
        double aire()
        {
            return radiant*rayon*rayon/2.0;
        }
        protected double radiant;
        protected double rayon;
    }
    
    class parallelepipede extends figure3D
    {
        double volume()
        {
            return h*hauteur*longeur;
        }
    }
    
    class sphere extends figure3D
    {
        void set(double rayon)
        {
            this.rayon = rayon;
        }
        double volume()
        {
            return (4.0/3.0)*pi*rayon*rayon*rayon;
        }
        protected double rayon;
    }
    
    class coneDeRevolution extends figure3D
    {
        void set(double rayon, double hauteur)
        {
            this.rayon = rayon;   
            this.hauteur = hauteur;
        }
        double volume()
        {
            return pi*rayon*rayon*hauteur/3.0;
        }
        protected double hauteur;
        protected double rayon;
    }
    
    class pyramidehRect extends figure3D
    {
        double volume()
        {
            return h*hauteur*longeur/3.0;
        }
    }
    
    class pyramidehTrian extends figure3D
    {
        double volume()
        {
            return h*hauteur*longeur/6.0;
        }
    
    }
    
    public static void main(String [] args)
    {
        figure2D globals = new Shapes().new figure2D();
        
        carre nouveauCarre = new Shapes().new carre();
        nouveauCarre.set(5);
        System.out.printf(
        "carre:\n aire:%s\t perimetre:%s\t diagonale:%s", nouveauCarre.aire(), nouveauCarre.perimetre(), nouveauCarre.diagonale());

        rectangle nouveauRectangle = new Shapes().new rectangle();
        nouveauRectangle.set(5,4);
        System.out.printf(
        "rectangle:\n aire:%s\t perimetre:%s", nouveauCarre.aire(), nouveauCarre.perimetre());

        parallelogramme nouveauParallelogramme = new Shapes().new parallelogramme();
        nouveauParallelogramme.set(5,6);
        System.out.printf(
        "rectangle:\n aire:%s", nouveauCarre.aire());

        trapeze nouveauTrapeze = new Shapes().new trapeze();
        nouveauTrapeze.set(6,3,8);
        System.out.printf(
        "rectangle:\n aire:%s", nouveauTrapeze.aire());

        triangle nouveauTriangle = new Shapes().new triangle();
        nouveauTriangle.set(9,5);
        System.out.printf(
        "triangle:\n aire:%s", nouveauTriangle.aire());

        triangleEq nouveauTriangleEq = new Shapes().new triangleEq();
        nouveauTriangleEq.set(4);
        System.out.printf(
        "triangleEq:\n aire:%s\t perimetre:%s\t hauteur:%s", nouveauTriangleEq.aire(), nouveauTriangleEq.perimetre(), nouveauTriangleEq.hauteur());

        triangleRecIso nouveauTriangleRecIso = new Shapes().new triangleRecIso();
        nouveauTriangleRecIso.set(9);
        System.out.printf(
        "triangleRecIso:\n aire:%s\t hypothenuse:%s\t hauteur:%s", nouveauTriangleRecIso.aire(), nouveauTriangleRecIso.hypothenuse(), nouveauTriangleRecIso.hauteur());

        cercle nouveauCercle = new Shapes().new cercle();
        nouveauCercle.set(6);
        System.out.printf(
        "cercle:\n aire:%s\t perimetre:%s", nouveauCercle.aire(), nouveauCercle.perimetre());

        secteurAngle nouveauSecteurAngle = new Shapes().new secteurAngle();
        nouveauSecteurAngle.set(9,2*globals.pi);
        System.out.printf(
        "secteurAngle:\n aire:%s\t longeur:%s", nouveauSecteurAngle.aire(), nouveauSecteurAngle.longeur());

        parallelepipede nouveauParallelepipede = new Shapes().new parallelepipede();
        nouveauParallelepipede.set(9,5,8);
        System.out.printf(
        "parallelepipede:\n volume:%s", nouveauParallelepipede.volume());
        
        sphere nouveauSphere = new Shapes().new sphere();
        nouveauSphere.set(6);
        System.out.printf(
        "sphere:\n volume:%s", nouveauSphere.volume());

        coneDeRevolution nouveauConeDeRevolution = new Shapes().new coneDeRevolution();
        nouveauConeDeRevolution.set(3,6);
        System.out.printf(
        "coneDeRevolution:\n volume:%s", nouveauConeDeRevolution.volume());

        pyramidehRect nouveauPyramidehRect = new Shapes().new pyramidehRect();
        nouveauPyramidehRect.set(3,6,4);
        System.out.printf(
        "pyramidehRect:\n volume:%s", nouveauPyramidehRect.volume());

        pyramidehTrian nouveauPyramidehTrian = new Shapes().new pyramidehTrian();
        nouveauPyramidehTrian.set(3,6,9);
        System.out.printf(
        "pyramidehRect:\n volume:%s", nouveauPyramidehTrian.volume());
    }
    
}
