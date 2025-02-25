### Injection des Dépendances en Java

Ce projet illustre les différentes techniques d'injection des dépendances en Java, incluant l'instanciation statique, dynamique et l'utilisation du framework Spring.

## Installation et lancement du projet

### Prérequis :
- Java JDK 8 ou supérieur
- Maven installé
- Un IDE comme IntelliJ IDEA ou Eclipse

### Étapes d'installation :

## 📂 Structure du projet

```bash
📂 Injection-Dependances-Java
├── 📁 src/main/java
│   ├── 📁 dao                # Interface et implémentation de la couche DAO
│   │   ├── IDao.java         # Interface DAO
│   │   ├── DaoImpl.java      # Implémentation concrète de DAO
│   │   ├── DaoImpl2.java      # Implémentation concrète de DAO avec les annotations spring
│   ├── 📁 metier             # Interface et implémentation de la couche métier
│   │   ├── IMetier.java      # Interface Métier
│   │   ├── MetierImpl.java   # Implémentation avec injection de dépendance
│   │   ├── MetierImpl2.java   # Implémentation avec injection de dépendance avec les annotations spring
│   ├── 📄 Main.java          # Classe principale pour tester l'injection statique
│   ├── 📄 MainDynamic.java          # Classe  pour tester l'injection dynamique
│   ├── 📄 MainAnno.java          # Classe principale pour tester les injections Framework Spring version annotations
│   ├── 📄 MainXml.java          # Classe principale pour tester les injections Framework Spring version XML
├── 📄 pom.xml               # Fichier de configuration Maven
├── 📄 README.md             # Documentation du projet
```

## Approches d'Injection des Dépendances

### 1. Par Instanciation Statique
L'instanciation des objets est gérée directement dans le code source, ce qui crée un couplage fort.

### 2. Par Instanciation Dynamique
Utilisation de `Class.forName()` pour créer les objets dynamiquement, rendant le code plus flexible.

### 3. En utilisant Spring
L'injection des dépendances est gérée par le framework Spring via :
- **Configuration XML** : Définition des beans dans `beans.xml`
- **Annotations** : Utilisation de `@Component`, `@Autowired`, etc.

## Commandes Git Utiles

```bash
git add .
git commit -m "Ajout d'une nouvelle fonctionnalité"
git push origin main
git pull origin main
git status
git log --oneline
```
## Execution
### Instanciation Statique
(5A.png)
### Instanciation Dynamique
(5b.png)
### En utilisant Spring (Configuration XML)
(5c.png)
### En utilisant Spring (Annotations)
(5d.png)

## Liens Utiles
- [Documentation Spring](https://spring.io/projects/spring-framework)

## Auteur
- **Soukaina LAKBICHI** - (https://github.com/SoukainaLAKBICHI2)
