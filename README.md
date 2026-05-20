# Ex15 - Listes d'objets

## Consigne pour les élèves

Votre mission est de **compléter les méthodes manquantes** dans les classes du dossier `services`.

Imaginez que vous gérez des rangées de casiers pour stocker des personnes :

1. **Algorithme avec trous** (`ListePersonne_AvecTrous`)
Vous avez une grande rangée de casiers numérotés.
Quand une personne part, son casier devient un **trou** (case vide) que vous pouvez réutiliser plus tard.
Votre objectif :
- ajouter une personne dans un casier libre ;
- supprimer une personne en laissant un trou ;
- retrouver une personne même si des trous existent au milieu.

2. **Algorithme sans trous** (`ListePersonne_SansTrous`)
Ici, les casiers doivent rester **collés les uns aux autres**.
Si une personne part, toutes les suivantes avancent d'un cran pour boucher le vide.
Votre objectif :
- ajouter à la bonne position ;
- supprimer puis décaler les éléments pour qu'il n'y ait aucun espace vide ;
- conserver une liste compacte et ordonnée.

3. **Algorithme dynamique** (`ListePersonne_Dynamique`)
Votre rangée de casiers peut **s'agrandir** quand elle est pleine.
Quand il n'y a plus de place, vous construisez une rangée plus grande et vous y recopiez les personnes.
Votre objectif :
- détecter quand la structure est pleine ;
- créer une capacité plus grande ;
- recopier correctement les données avant de continuer les insertions.

## Explication visuelle (tableaux)

### 1) Liste avec trous

Suppression de `Bob` (on laisse un trou) :

| Index | 0 | 1   | 2   | 3   | 4 |
|------:|---|-----|-----|-----|---|
| Avant | Ana | Bob | Chloé | David | - |
| Après | Ana | **-** | Chloé | David | - |

Ajout de `Emma` (on réutilise le premier trou) :

| Index | 0 | 1   | 2   | 3   | 4 |
|------:|---|-----|-----|-----|---|
| Avant | Ana | **-** | Chloé | David | - |
| Après | Ana | Emma | Chloé | David | - |

### 2) Liste sans trous

Suppression de `Bob` (on décale tout vers la gauche) :

| Index | 0 | 1   | 2   | 3   | 4 |
|------:|---|-----|-----|-----|---|
| Avant | Ana | Bob | Chloé | David | - |
| Après | Ana | Chloé | David | - | - |

Ici, il n'y a jamais de vide entre deux personnes.

### 3) Liste dynamique

Capacité initiale = 3, puis agrandissement quand c'est plein :

| Index | 0 | 1   | 2   |
|------:|---|-----|-----|
| Avant (plein) | Ana | Bob | Chloé |

Après agrandissement (nouvelle capacité = 4) :

| Index | 0 | 1   | 2   | 3   |
|------:|---|-----|-----|-----|
| Après copie | Ana | Bob | Chloé |
| Après ajout `David` | Ana | Bob | Chloé | David |

Le principe : quand la rangée est pleine, on crée une rangée plus grande et on recopie les éléments.

## Attendus

- Compléter toutes les méthodes indiquées dans les classes de service.
- Respecter les signatures existantes (ne pas changer les noms de classes/méthodes).
- Tester vos méthodes avec différents cas : liste vide, liste pleine, suppression au début/milieu/fin.
- Vérifier que l'application se lance sans erreur.
- Vous pouvez laisser la suppression pour l'algorithmique dynamique