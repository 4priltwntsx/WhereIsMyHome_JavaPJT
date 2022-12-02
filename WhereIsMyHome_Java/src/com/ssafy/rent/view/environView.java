package com.ssafy.rent.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class environView extends JFrame {
	JFrame frame = new JFrame();
	JTable table = new JTable();
	JScrollPane scroll;
	ArrayList<ArrayList<String>> data = new ArrayList<>();
	String[] title = {"업체명","주소지","점검일"};
	ArrayList<String> donglist = new ArrayList<>();
	JTextField searchBar;
	JButton searchBt;
	JPanel top;
	String[][] changeData;
	DefaultTableModel model;
	
	 public static String[][] convertToArray(ArrayList<ArrayList<String>> list) {
		 String[][] result = new String[list.size()][];

	        for (int i = 0; i < list.size(); i++) {
	            result[i] = new String[list.get(i).size()];
	        }

	        for (int i = 0; i < list.size(); i++) {
	            for (int j = 0; j < list.get(i).size(); j++) {
	                result[i][j] = list.get(i).get(j);
	            }
	        }

	        return result;
	}
	 
	public ArrayList<ArrayList<String>> search(String searchdong) {
		ArrayList<ArrayList<String>> result = new ArrayList<>();
		for(ArrayList<String> arr: data) {
			if(arr.get(1).contains(searchdong)) {
				result.add(arr);
			}
		}
		return result;
	}

	public void createFrame() throws IOException {
		
		searchBar = new JTextField();
		searchBt = new JButton("검색");

		goCSV gCSV = new goCSV("./res/environment.csv");
		String[] line = null;

		while((line = gCSV.nextRead()) != null) {
			ArrayList<String> address = new ArrayList<>();
			address.add(line[0]);
			address.add(line[line.length-1]); 
			address.add(line[4]);
			//donglist.add(line[line.length-1].split(" ")[2]);
			data.add(address);
		}
		String[][] newData = convertToArray(data);
		changeData = newData;
		
		model = new DefaultTableModel(changeData,title);
		table = new JTable(model);
		scroll = new JScrollPane(table);
		
		
		frame.add(searchBar, BorderLayout.NORTH);
		frame.add(searchBt, BorderLayout.SOUTH);
		frame.add(scroll, BorderLayout.CENTER);
		
		

		
		frame.pack();

		//프레임 보이기
		frame.setVisible(true);
		
		searchBt.addActionListener(e -> {
			changeData = convertToArray(search(searchBar.getText()));
				
			model.setDataVector(changeData, title);
		});

		//swing에만 있는 X버튼 클릭시 종료
		JButton btnDispose = new JButton("Dispose");
		btnDispose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
	}

}
