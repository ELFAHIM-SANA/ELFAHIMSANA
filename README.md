Rapport TP01:
1. L'interface IDao avec une méthode getDate
   
   ![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/06594d1b-2315-422d-8732-259f7e54600a)

2. Créer une implémentation de cette interface
   
![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/c3d45513-4520-4e2c-a79a-5107a06097d9)


3. Créer l'interface IMetier avec une méthode calcul

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/6f013643-001d-4b24-8fb2-b14e252399be)

4. Créer une implémentation de cette interface en utilisant le couplage faible
   
![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/4ee6cc9c-09c2-4220-b8d3-61dff1082633)

5. Faire l'injection des dépendances :
      -Par instanciation statique= utilisation de new.

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/08397bae-aed9-45c4-b759-8f1071c7f84a)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/c9c77af7-b3c0-4566-9d0e-13ede7e63afe)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/cdc0cdec-5a9a-4ea0-a80f-423c7ec36c0c)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/64a4aa43-7420-4a6f-b9ba-09582ac6899a)

      -Par instanciation dynamique.
      
![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/1ba6abe6-10e9-44ea-b0b0-fb94f5c7ea40)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/eb9ee887-b380-4f56-a84b-d2c3c81a222a)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/d6268605-a391-47ae-934f-5669ac938ae4)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/c4753388-0188-47bb-82b9-29db5a9ca23f)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/ac5ef200-9874-4601-8ae9-599482e13623)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/0e804846-09bb-4af5-a42e-128a526404a2)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/f75aed8d-406c-4c41-a88e-b3a25abbe1ab)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/4fe7a5ef-67f3-48ab-bd46-061b648d3efd)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/a0930379-d855-4605-968d-4d5173fe982b)

  - En utilisant le Framework Spring:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/ba449542-099a-42e3-99c6-0fef87ccc96c)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/7cc823f5-a4cb-4660-8d10-f9641bbb6b51)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/72dac094-ecd2-4944-bc49-3cd506775217)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/3fdf19ed-1663-4ced-bc38-82664e1f3a03)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/c72280bd-97cc-41e3-8a72-9c5f3bdce41f)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/5e9a4140-a81b-491d-9e0e-ac9e2fc44812)

-Version Annotation:
        
![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/7135b801-8bf3-4ea1-a61b-e8009ecee9fc)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/7cfab85f-2f36-45a1-84fa-bf3f7a292436)

 -Injection via constructeur:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/b32eaf30-5bbe-44d6-a055-df1bc34fd2f6)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/d1e639e2-58c7-4837-b0d1-f19861f360f9)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/71fd7471-9e9a-477b-b7a2-50e8ef08940a)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/9aaf386f-b154-4249-a11e-d3f6a5a5e7ad)

  Remarques:
  -- Si on utilise la notation Autowired:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/b28e3a8f-7e14-4d28-93b4-ea92b8f9a5c4)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/43d7235e-ca65-453f-8361-a3b302434666)

         -----> On aura l'exception suivante ConflictingBeanDefinitionException
et lorsqu'on fait les modifications suivantes:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/aa188cb3-7d6e-45e1-8318-48fb81c6126b)

on aura:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/8e298d10-56ef-4d96-8b3e-c8d87d603d1a)

---->Ms avec le constructeur on aura pas de probléme car meme si on a 2 instances il injecte la premiére qui trouve dans le beans 
              
On a ajouter une dépendance pour le test:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/6430cc57-da83-4df1-8cf4-2af3c166fc15)

Pour tester on a ajouter une classe Calcul pour calculer la somme de 2 nombres.

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/254dbe0e-3beb-4125-b22f-96a7e30dfffb)

on a creer une classe pour le test:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/7146c678-2681-4139-b2b7-652ba0954afa)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/f025b46d-c3da-4639-8ed2-68fca4518eb4)

-----Remarque------
On trouve ici tous les commandes de base sans utiliser l’invit de commande:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA/assets/131165163/c2efe4ae-75ea-4634-8706-94f729323bf5)

ou bien utiliser le terminale et taper les commandes.


