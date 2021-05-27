public class XoRCipher {
    static String doTheMagic(String inputString)
    {
        char xorKey = '1';
        String outputString = "";
        int len = inputString.length();
        for (int i = 0; i < len; i++)
        {
            outputString = outputString +
            Character.toString((char) (inputString.charAt(i) ^ xorKey));
        }

        System.out.println(outputString);
        return outputString;
    }

    // Driver code
    public static void main(String[] args)
    {
        String sampleString = "CrackThis";

        // Encrypt the string
        System.out.println("Encrypted String");
        String encryptedString = doTheMagic(sampleString);

        // Decrypt the string
        System.out.println("Decrypted String");
        doTheMagic(encryptedString);
    }
}