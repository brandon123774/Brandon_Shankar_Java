package com.company.Composition;

public class RewardsMember {

        private String cardNumber;
        public boolean isRewardsMember;

        public RewardsMember(String cardNumber, boolean isRewardMember) {
                this.cardNumber = cardNumber;
                this.isRewardsMember = isRewardMember;
        }

        public String getCardNumber() {
                return cardNumber;
        }

        public void setCardNumber(String cardNumber) {
                this.cardNumber = cardNumber;
        }

        public boolean isRewardMember() {
                return isRewardsMember;
        }

        public void setRewardMember(boolean rewardMember) {
                isRewardsMember = rewardMember;
        }
}
