package bankagent.objects;

public interface BankVocabulary {

   //-------> Basic vocabulary
   public static final int NEW_ACCOUNT = 1;
   public static final int DEPOSIT = 2;
   public static final int WITHDRAWAL = 3;
   public static final int BALANCE = 4;
   public static final int STATEMENTS = 5;
   public static final int ADMIN = 6;
   public static final int NOT_ENOUGH_MONEY = 10;
   public static final int ACCOUNT_NOT_FOUND = 11;
   public static final int ILLEGAL_OPERATION = 12;
   public final float BAL_CHARGE = (float)1.25;   
   public final float STAT_CHARGE = (float)2.5;
   public static final String SERVER_AGENT = "Server agent";
   public static final String PB_ACCOUNT_NOT_FOUND = "Account not found";
   public static final String PB_NOT_ENOUGH_MONEY = "Not enough money";
   public static final String PB_ILLEGAL_OPERATION = "Illegal operation";

   //-------> Ontology vocabulary
   public static final String ACCOUNT = "Account";
   public static final String ACCOUNT_ID = "id";
   public static final String ACCOUNT_NAME = "name";
   public static final String ACCOUNT_BALANCE = "balance";

   public static final String CREATE_ACCOUNT = "Create_account";
   public static final String CREATE_ACCOUNT_NAME = "name";

   public static final String STATEMENT = "Statement";
   public static final String STATEMENT_TYPE = "type";
   public static final String STATEMENT_AMOUNT = "amount";
   public static final String STATEMENT_BALANCE = "balance";
   public static final String STATEMENT_ACCOUNTID = "accountId";
   public static final String STATEMENT_DATE = "date";

   public static final String MAKE_STATEMENT = "MakeStatement";
   public static final String MAKE_STATEMENT_TYPE = "type";
   public static final String MAKE_STATEMENT_AMOUNT = "amount";
   public static final String MAKE_STATEMENT_ACCOUNTID = "accountId";

   public static final String INFORMATION = "Information";
   public static final String INFORMATION_TYPE = "type";
   public static final String INFORMATION_ACCOUNTID = "accountId";

   public static final String PROBLEM = "Problem";
   public static final String PROBLEM_NUM = "num";
   public static final String PROBLEM_MSG="msg";

}