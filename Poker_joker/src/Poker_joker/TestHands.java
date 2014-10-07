package Poker_joker;


import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import poker.Card;
import poker.Deck;
import poker.Hand;
import poker.eHandStrength;
import poker.eRank;
import poker.eSuit;

public class TestHands {

	@Test
	public final void TestTwoJokers() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.Joker,eRank.JOKER));
		rfHand.add(new Card(eSuit.Joker,eRank.JOKER));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be 5K:",eHandStrength.FiveofAkind.getHandStrength(),h.getHandStrength());		
	}

	@Test
	public final void FiveOfAKindWithTwoJokers() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.Joker,eRank.JOKER));
		rfHand.add(new Card(eSuit.Joker,eRank.JOKER));
		rfHand.add(new Card(eSuit.CLUBS,eRank.EIGHT));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.FIVE));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.FOUR));

		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be 5K:",eHandStrength.FiveofAkind.getHandStrength(),h.getHandStrength());		
	}


	
	@Test
	public final void TestTwoJokersFiveOfAKind() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.Joker,eRank.JOKER));
		rfHand.add(new Card(eSuit.Joker,eRank.JOKER));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.FIVE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FIVE));
		rfHand.add(new Card(eSuit.HEARTS,eRank.FIVE));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be 5K:",eHandStrength.FiveofAkind.getHandStrength(),h.getHandStrength());		
	}
	
	@Test
	public final void TestTwoJokersRoyalFlush() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.Joker,eRank.JOKER));
		rfHand.add(new Card(eSuit.Joker,eRank.JOKER));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.ACE));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.KING));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.TEN));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be RF:",eHandStrength.RoyalFlush.getHandStrength(),h.getHandStrength());		
	}
	
	@Test
	public final void TestTwoJokersRoyalFlush1() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.Joker,eRank.JOKER));
		rfHand.add(new Card(eSuit.Joker,eRank.JOKER));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.KING));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.JACK));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.TEN));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be RF:",eHandStrength.RoyalFlush.getHandStrength(),h.getHandStrength());		
	}
	
	@Test
	public final void TestTwoJokersStraightFlush() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.Joker,eRank.JOKER));
		rfHand.add(new Card(eSuit.Joker,eRank.JOKER));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.FOUR));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.THREE));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.TWO));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be SF:",eHandStrength.StraightFlush.getHandStrength(),h.getHandStrength());		
	}
	
	@Test
	public final void FourOfAKindWithTwoJokers() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.Joker,eRank.JOKER));
		rfHand.add(new Card(eSuit.Joker,eRank.JOKER));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.FOUR));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.EIGHT));
		rfHand.add(new Card(eSuit.CLUBS,eRank.EIGHT));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be 4K:",eHandStrength.FourOfAKind.getHandStrength(),h.getHandStrength());		
	}
	
	@Test
	public final void FlushWithTwoJokers() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.Joker,eRank.JOKER));
		rfHand.add(new Card(eSuit.Joker,eRank.JOKER));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.FOUR));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.EIGHT));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.THREE));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be F:",eHandStrength.Flush.getHandStrength(),h.getHandStrength());		
	}
	
	@Test
	public final void StraightWithTwoJokers() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.Joker,eRank.JOKER));
		rfHand.add(new Card(eSuit.Joker,eRank.JOKER));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.FIVE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FOUR));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.THREE));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be S:",eHandStrength.Straight.getHandStrength(),h.getHandStrength());		
	}
	
	@Test
	public final void ThreeOfAKindWithTwoJokers() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.Joker,eRank.JOKER));
		rfHand.add(new Card(eSuit.Joker,eRank.JOKER));
		rfHand.add(new Card(eSuit.HEARTS,eRank.FIVE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.NINE));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.THREE));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be 3K:",eHandStrength.ThreeOfAKind.getHandStrength(),h.getHandStrength());		
	}
}
