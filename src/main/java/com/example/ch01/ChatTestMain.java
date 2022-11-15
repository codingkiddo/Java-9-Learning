package com.example.ch01;



class QuestoinWorker implements Runnable {
	
	ChatWindow chat;
	String[] s1 = { "Hi", "How are you ?", "I am also doing fine!" };

	public QuestoinWorker(ChatWindow chatWindow) {
		this.chat = chatWindow;
	}
	
	@Override
	public void run() {
		for( int i=0; i<s1.length; i++ ) {
			chat.question(s1[i]);
		}
	}
}


class AnswerWorker implements Runnable {
	
	ChatWindow chat;
	String[] s2 = { "Hi", "I am good, what about you?", "Great!" };

	public AnswerWorker(ChatWindow chatWindow) {
		this.chat = chatWindow;
	}
	
	@Override
	public void run() {
		for( int i=0; i<s2.length; i++ ) {
			chat.answer(s2[i]);
		}
	}
}

public class ChatTestMain {

	public static void main(String[] args) {

		ChatWindow chatWindow = new ChatWindow();
		Thread questionThread = new Thread(new QuestoinWorker(chatWindow));
		Thread answerThread = new Thread(new AnswerWorker(chatWindow));
		
		questionThread.start();
		answerThread.start();
	}

}
