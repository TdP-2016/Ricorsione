/////////////////////////////////////////////////////////////////-*-java-*-*//
//             // Classroom code for "Tecniche di Programmazione"           //
//   #####     // (!) Giovanni Squillero <giovanni.squillero@polito.it>     //
//  ######     //                                                           //
//  ###   \    // Copying and distribution of this file, with or without    //
//   ##G  c\   // modification, are permitted in any medium without royalty //
//   #     _\  // provided this notice is preserved.                        //
//   |   _/    // This file is offered as-is, without any warranty.         //
//   |  _/     //                                                           //
//             // See: http://staff.polito.it/giovanni.squillero/dida.php   //
//////////////////////////////////////////////////////////////////////////////

import java.util.ArrayList;
import java.util.List;

public class Main {

	List<String> speranza;
	String colonna;
	
	public static void main(String[] args) {
		Main z = new Main();
		z.speranza = new ArrayList<String>();
		z.speranza.add("1");
		z.speranza.add("1X2");
		z.speranza.add("12");
		z.speranza.add("X");
		z.speranza.add("1");
		z.speranza.add("1X2");
		z.colonna = "";
		z.ric(0);
	}
	
	private void ric(int passo) {
		if(passo == speranza.size()) {
			System.out.println(colonna);
			return;
		}
		
		for(int c = 0; c < speranza.get(passo).length(); ++c) {
			// FAI
			colonna += speranza.get(passo).charAt(c);
			// RICORSIONE
			ric(passo+1);
			// DISFI
			colonna = colonna.substring(0,  colonna.length()-1);
		}
	}

}
