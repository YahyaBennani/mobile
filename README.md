ss
# 🍕 PizzaApp - TP Android
ttest final
test json
https://github.com/user-attachments/assets/22c8f83d-8e60-4b08-855c-47bb622b0937


## 📱 Fonctionnalités

- Splash screen animé
- Liste des pizzas avec `ListView` et adapter personnalisé
- Affichage des détails (ingrédients, description, etc.) dans une seconde activité
- Passage de données entre activités (`Serializable`)
- Architecture modulaire (models, dao, service, adapter, ui)

## 🗂️ Structure du projet

```
com.example.pizzaapp/
├── models/Pizza.java
├── dao/PizzaDao.java & PizzaDaoImpl.java
├── service/PizzaService.java
├── adapter/PizzaAdapter.java
└── ui/
    ├── SplashActivity.java
    ├── MainActivity.java
    └── DetailActivity.java
res/
├── layout/ (activity_splash, activity_main, activity_detail, list_item_pizza)
├── drawable/ (images des pizzas et logo)
├── values/ (strings, colors, styles)
└── anim/ (splash_animation.xml)
```
