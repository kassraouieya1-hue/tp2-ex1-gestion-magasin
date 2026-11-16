# TP 2 : Exercice 1 : Gestion de magasin

Nom et prénom :Eya kassraoui

## Diagramme de classes UML

**Classe Article**

Attributs :
- Numinventaire : int
- Désignation : String
- Couleur : String
- Prix : double
- Famille : String

Méthodes :
- Article()
- toString() : String
- memeFamille(Article) : boolean

**Classe Article_Lot**

Hérite de la classe Article.

Attribut :
- nbPieces : int

Méthodes :
- Article_Lot()
- toString() : String

**Classe Magasin**

Attributs :
- Capacité : int
- Stock : Article[]
- nbarticle : int

Méthodes :
- Magasin()
- Ajout(Article) : void
- Inventaire() : void

**Relation :** Article_Lot hérite de Article. Magasin contient plusieurs Articles.


