import java.util.Vector;
class Groceries
{
public static void main(String args[])
{

Vector<String>fruits=new Vector<>();
fruits.add("Mango");
fruits.add("Banana");
fruits.add("Grapes");
fruits.add("Pineapple");
fruits.add("Orange");
fruits.add("Muskmelon");
fruits.add("Watermelon");
fruits.add("Strawberry");
System.out.println("  fruits :"+fruits);

Vector<String>vegetables=new Vector<>();
vegetables.add("Brinjal");
vegetables.add("Drumstick");
vegetables.add("Lady's Finger");
vegetables.add("Beetroot");
vegetables.add("Pumpkin");
vegetables.add("Bottle guard");
vegetables.add("Tomato");
vegetables.add("Carrot");
System.out.println("vegetables:"+ vegetables);

Vector<String>animalproduce=new Vector<>();
animalproduce.add("Chicken");
animalproduce.add("Meat ");
animalproduce.add("Fish");
animalproduce.add("Eggs");
System.out.println("animalproduce:"+animalproduce );

Vector<String>dairyproduce=new Vector<>();
dairyproduce.add("Milk");
dairyproduce.add("Cheese");
dairyproduce.add("Butter ");
dairyproduce.add("Yogurt");
dairyproduce.add("Ghee");
System.out.println("dairyproduce:"+dairyproduce );

Vector<String>bakeryproducts=new Vector<>();
bakeryproducts.add("Whole_Wheat_Bread");
bakeryproducts.add("Kulchas");
bakeryproducts.add("Bakery_buns ");
bakeryproducts.add("Biscuits");
bakeryproducts.add("Cakes");
System.out.println("bakeryproducts:"+bakeryproducts );

Vector<String>condiments=new Vector<>();
condiments.add("Salt");
condiments.add("Pepper");
condiments.add("Sugar ");
System.out.println("condiments:"+condiments );


Vector<String>indianspecies=new Vector<>();
indianspecies.add("Cardamom");
indianspecies.add("Cinnamon");
indianspecies.add("Nutmeg ");
indianspecies.add("Zeera");
indianspecies.add("Ajwain");
indianspecies.add("Turmeric");
System.out.println("indianspecies:"+ indianspecies);

Vector<String>oilsandsauces=new Vector<>();
oilsandsauces.add("Olive_oil");
oilsandsauces.add("Mustard_oil");
oilsandsauces.add("Sunflower_oil ");
oilsandsauces.add("Soya_sauce");
oilsandsauces.add("Fish_sauce");
oilsandsauces.add("Vinegar");
oilsandsauces.add("Tomato_ketchup");
System.out.println("oilsandsauces:"+ oilsandsauces);

Vector<String>grainslegumes=new Vector<>();
grainslegumes.add("Atta");
grainslegumes.add("Rice");
grainslegumes.add("Pasta ");
System.out.println("grainslegumes:"+grainslegumes );

Vector<String>legumes=new Vector<>();
legumes.add("Chickpeas");
legumes.add("Kidney beans");
legumes.add("lentis ");
legumes.add("beans");
System.out.println("legumes:"+legumes );

Vector<String>snacks=new Vector<>();
snacks.add("Walnuts");
snacks.add("Almonds");
snacks.add("Raisins ");
snacks.add("Papad");
snacks.add("Honey");
System.out.println("snacks:"+snacks );

Vector<String>cleaningSupplies=new Vector<>();
cleaningSupplies.add("Dishwasher_soap");
cleaningSupplies.add("Detergent_powder");
cleaningSupplies.add("Shaving_cream ");
cleaningSupplies.add("Toilet_Cleaner");
cleaningSupplies.add("Floor_cleaner");
cleaningSupplies.add("soap");
cleaningSupplies.add("Shampoo");
cleaningSupplies.add("Toilet_roll");
cleaningSupplies.add("Tissue_paper");
cleaningSupplies.add("Toothpaste");
cleaningSupplies.add("Brush");
cleaningSupplies.add("Broom");
cleaningSupplies.add("Mopper");
System.out.println("cleaningSupplies:"+ cleaningSupplies);

Vector<String>groceries=new Vector<>();
groceries.addAll(fruits);
groceries.addAll(vegetables);
groceries.addAll(animalproduce);
groceries.addAll(dairyproduce);
groceries.addAll(bakeryproducts);
groceries.addAll(condiments);
groceries.addAll(indianspecies);
groceries.addAll(oilsandsauces);
groceries.addAll(grainslegumes);
groceries.addAll(legumes);
groceries.addAll(snacks);
groceries.addAll(cleaningSupplies);

System.out.println("All Groceries are:"+groceries);
}
}