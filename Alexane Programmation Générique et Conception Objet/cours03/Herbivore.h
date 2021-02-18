#ifndef HERBIVORE_H_
#define HERBIVORE_H_

#endif /*HERBIVORE_H_*/

/*
 * Herbivore.h
 *
 *
 */

#ifndef ANIMAL_H_
#include "../../Alexane Programmation Générique et Conception Objet/cours03/Animal.h"
#endif

/** Creation et gestion d'herbivore
 * @author montacie
 */
class Herbivore : public Animal {
protected:
    /** est-ce un ruminant ? */    
    bool ruminant;	
public:
    /** Creation d'une nouvelle instance de la classe Herbivore
     * @param type espece d'herbivores
     */
    Herbivore(string type, int pattes, bool ruminant);
    
    /** presentation des caracteristiques de l'herbivore */
    void presente();
};
