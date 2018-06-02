/** 
 */
package data;

import static utilities.Calculate.nutrientTotal;

/**
 *
 * @author Tender
 */
public class DataManagement {
    
    public static void saveData(String ingredientName, double servingSize, double calories, double fat, double cholesterol, double sodium, double potassium, double carbohydrates, double fiber, double protein, String measurementType, double ingredientAmt) {
            
        // TODO: Store data in database  
        
        // calculate values for current recipe
        double caloriesTotal = nutrientTotal(servingSize, calories, ingredientAmt, measurementType);
        double fatTotal = nutrientTotal(servingSize, fat, ingredientAmt, measurementType);
        double cholesterolTotal = nutrientTotal(servingSize, cholesterol, ingredientAmt, measurementType);
        double sodiumTotal = nutrientTotal(servingSize, sodium, ingredientAmt, measurementType);
        double potassiumTotal = nutrientTotal(servingSize, potassium, ingredientAmt, measurementType);
        double carbTotal = nutrientTotal(servingSize, carbohydrates, ingredientAmt, measurementType);
        double fiberTotal = nutrientTotal(servingSize, fiber, ingredientAmt, measurementType);
        double proteinTotal = nutrientTotal(servingSize, protein, ingredientAmt, measurementType);
        
        // TODO: display values and store data to session

    }
}
