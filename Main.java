import java.util.Scanner;

public class Main{
	
	private static Scanner keyborad;
	public static void main(String[] args) {
		
		Scanner keyborad = new Scanner(System.in);
		int n=6;
		int motsdepasse=123;
		int mp=0;
		int quitter=1;
		String choix=new String();
		int mychoix=5;
		int av=0;
		
		Vols[] lesvols =new Vols[50];
		lesvols[0]= new Vols(124,12478,"21/02/2014","16h","18h30",5);
		lesvols[1]= new Vols(1224,47847,"04/05/2014","20h","21/10",3);
		lesvols[2]= new Vols(6274,8452,"14/10/2014","11h","21h30",1);
		lesvols[3]= new Vols(2454,4625,"28/04/2014","15h","18h30",4);
		lesvols[4]= new Vols(954,16485,"05/12/2015","16h","05h30",5);
		lesvols[5]= new Vols(32804,29154,"15/12/2015","06h","09h40",2);
		lesvols[6]= new Vols(71124,61344,"22/04/2014","10h","12h",4);
		
		while((mychoix<0)||(mychoix>2))
		{
			System.out.println(" Vous etes: ");
			System.out.println("1: voyagueur/visiteur ");
			System.out.println("2: Employer");
			System.out.println("0: Quitter");
			mychoix = keyborad.nextInt();
			if((mychoix<0)||(mychoix>2))
			{
				System.out.println("ERREUR: CHOIX INCORRECTE");
			}
		}	
	while((mychoix<=2)&&(mychoix>=1))	
	{
		//si c'est un visiteur
		if(mychoix==1)
		{
			System.out.println("Saisie: ");
			System.out.println("0: Quitter");
			System.out.println("1: Afficher les vols ");
			System.out.println("2: Chercher un vol ");
			int choisir=keyborad.nextInt();
			//affiche les vols
			if(choisir==1)
			{
				System.out.println("                       **************************** LES VOLS **************************** ");
				System.out.println("");
				for (int i=0; i<n ; i++)
				{
					System.out.println("---------------------------------------------------------------------------------------------------------------");
					System.out.println(lesvols[i].toString());
					System.out.println("---------------------------------------------------------------------------------------------------------------");
				}				
			}
			//chercher un vol
			else if(choisir==2)
			{
				boolean verif=false;
				while(verif==false)
				{
					System.out.println("Saisie le numero de vol a chercher ou Saisie 0 pour retourner au menu principale");
					av = chercher(lesvols,n);
					verif=true;
					if(av==-1)
					{
						System.out.println("ERREUR: numero de vol introuvable");
						verif=false;
					}
				}
			}
			//quitter
			else 
			{
				mychoix=choisir;
			}

		}
		//si c'est un employer
		else if (mychoix==2)
		{
			//saisie mot de passe
			while((mp!=motsdepasse)&&!(mychoix==0))
			{
				mp=0;
				System.out.println("Saisie mot de passe d'accès ou saisie 0 pour Quitter ");
				mp=keyborad.nextInt();
				if((mp!=motsdepasse)&&(mp!=0))
				{
					System.out.println("ERREUR: << Mot de passe incorrecte >>");
					
				}
				if(mp==0)
				{
					mychoix=0;
				}
			}
			//mot de passe correct
			if(mp==motsdepasse)
			{
					System.out.println("   Saisie: ");
					System.out.println("1: Afficher tout les vols");
					System.out.println("2: Chercher un vol");
					System.out.println("3: Modfier un vol ");
					System.out.println("4: Supprimer un vol ");
					System.out.println("5: Ajouter un vol");
					System.out.println("0: Quitter");
					int choisir=keyborad.nextInt();
					//Quitter
					if(choisir==0)
					{
						mychoix=choisir;
					}
					//Afficher tout les vols
					else if(choisir==1)
					{

						System.out.println("                       **************************** LES VOLS **************************** ");
						System.out.println("");
						for (int i=0; i<n ; i++)
						{
							System.out.println("---------------------------------------------------------------------------------------------------------------");
							System.out.println(lesvols[i].toString());
							System.out.println("---------------------------------------------------------------------------------------------------------------");
						}			
					}
					//cherche un vol
					else if(choisir==2)
					{
						boolean verif=false;
						while(verif==false)
						{
							System.out.println("Saisie le numero de vol a chercher ou Saisie 0 pour retourner au menu principale");
							av = chercher(lesvols,n);
							verif=true;
							if(av==-1)
							{
								System.out.println("ERREUR: numero de vol introuvable");
								verif=false;
							}
						}
					}
					//modifier un vol
					else if(choisir==3)
					{
						boolean verif=false;
						while(verif==false)
						{
							System.out.println("Saisie le numero de vol a modifier ou Saisie 0 pour retourner au menu principaler");
							av=chercher(lesvols,n);
							verif=true;
							if(av==-1)
							{
								System.out.println("ERREUR: numero de vol introuvable");
								verif=false;
							}
						}
						//System.out.println(av);
						if(av==0)
						{
							verif=false;
							while(verif==false)
							{
								System.out.println(" Vous voulez modifier:");
								System.out.println("1: Numero d'avion");
								System.out.println("2: Le date");
								System.out.println("3: L'heure de depart ");
								System.out.println("4: L'heure d'arriver ");
								System.out.println("5: Le porte debarquement ");
								System.out.println("0: retourner au menu principale");
								int key = keyborad.nextInt();
								verif=true;
								if(key==1)
								{
									System.out.println("saisie le nouveau numero avion");
									int nouveau = keyborad.nextInt();
									lesvols[av].setNumAvion(nouveau);					
								}
								else if(key==2)
								{
									System.out.println("saisie le nouveau date de vole");
									String nouveau=new String();
									nouveau = keyborad.nextLine();
									lesvols[av].setDate(nouveau);
								}
								else if(key==3)
								{
									System.out.println("saisie le nouveau heure de depart");
									String nouveau=new String();
									nouveau = keyborad.nextLine();
									lesvols[av].setHeureDepart(nouveau);
								}
								else if(key==4)
								{
									System.out.println("saisie le nouveau heure d'arriver");
									String nouveau=new String();
									nouveau = keyborad.nextLine();
									lesvols[av].setHeureArriver(nouveau);
								}	
								else if(key==5)
								{
									System.out.println("saisie le nouveau porte de debarquement");
									int nouveau = keyborad.nextInt();
									lesvols[av].setPorte(nouveau);
								}	
								else if(key!=0)
								{
									System.out.println("ERREUR: CHOIX INCORRECTE");
									verif=false;
								}
							}
						}
					}
					//supprimer un vols
					else if(choisir==4)
					{
						boolean verif=false;
						while(verif==false)
						{
							System.out.println("Saisie numero de vol a supprimer ou 0 retourner au menu principale");
							av = chercher(lesvols,n);
							verif=true;
							//si vol choisie n'existe pas
							if(av==-1)
							{
								System.out.println("ERREUR: numero de vol introuvable");
								verif=false;
							}
						}
						if(av!=-1)
						{
							lesvols[av]=new Vols();				
						}
					}
					//ajouter un vol
					else if(choisir==5)
					{
						boolean verif=false;
						int numv = 0,i = 0;
						while(verif==false)
						{
							verif=true;
							i=0;
							System.out.println("Saisie nouveau numero de vols a ajouter ou 0 retourner au menu principale");
							numv = keyborad.nextInt();
							while((lesvols[i].getNumvols()!=numv)&&(i<n))
							{
								i=i+1;
							}
							if((i!=n))
							{
								System.out.println("ERREUR: Numero de vol saisi existe deja");
								verif=false;
							}
						}
						if((i==n)&&(numv!=0))
						{
							System.out.println("saisie nouveau numero de avion pour le vols ajouter: ");
							lesvols[n].setNumAvion(keyborad.nextInt());
							lesvols[n].setDate(keyborad.nextLine());
							System.out.println("saisie heure de depart de vols ajouter: ");
							lesvols[n].setHeureDepart(keyborad.nextLine());
							System.out.println("saisie heure d'arriver de vols ajouter: ");
							lesvols[n].setHeureArriver(keyborad.nextLine());
							System.out.println("saisie porte de depart de vols ajouter: ");
							lesvols[n].setPorte(keyborad.nextInt());
							lesvols[n].setNumvols(numv);
							n=n+1;
						}
					}
					else
					{
						System.out.println("Erreur");
					}
					
				}
			}
		}
	if(mychoix==0)
	{
		System.out.println(" ****************** MERCI POUR VOTRE VISITE AU REVOIR ******************");
		System.out.println("              ****************  AU REVOIR ****************");
	}
	else
	{
		System.out.println("choix inccorecte");
	}
	}
	public static int chercher(Vols[] lesvols, int n) 
	{
		Scanner keyborad = new Scanner(System.in);
		int i=0;
		int numv = keyborad.nextInt();
		while((lesvols[i].getNumvols()!=numv)&&(i<n))
		{
			i=i+1;
		}
		if(i!=n)
		{

			System.out.println("---------------------------------------------------------------------------------------------------------------");
			System.out.println(lesvols[i].toString());
			System.out.println("---------------------------------------------------------------------------------------------------------------");
			return i;
			
		}
		else if(i==n)
		{
			return -1;			
		}
		else
		{
			return -2;
		}
	}
}
