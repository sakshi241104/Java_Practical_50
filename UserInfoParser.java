public class UserInfoParser {
    public static void main(String[] args) {
        String userData = "USERID:sakshi | FULLNAME:Sakshi Patil | ROLE:Admin";
        
        // Step 1: Extract full name
        String fullNameKey = "FULLNAME:";
        String roleKey = "ROLE:";
        String separator = "|";
        
        int fullNameStart = userData.indexOf(fullNameKey);
        if (fullNameStart == -1) {
            System.out.println("FULLNAME key not found.");
            return;
        }
        fullNameStart += fullNameKey.length();  // move past “FULLNAME:”
        
        int fullNameEnd = userData.indexOf(separator, fullNameStart);
        if (fullNameEnd == -1) {
            // If there is no separator after full name, go to end of string
            fullNameEnd = userData.length();
        }
        
        String fullName = userData.substring(fullNameStart, fullNameEnd).trim();
        
        // Step 2: Extract role
        int roleStart = userData.indexOf(roleKey);
        if (roleStart == -1) {
            System.out.println("ROLE key not found.");
            return;
        }
        roleStart += roleKey.length();  // move past “ROLE:”
        
        // role goes till end (or until next separator, if exists)
        int roleEnd = userData.indexOf(separator, roleStart);
        if (roleEnd == -1) {
            roleEnd = userData.length();
        }
        
        String role = userData.substring(roleStart, roleEnd).trim();
        
        // Bonus: make role lowercase
        String roleLower = role.toLowerCase();
        
        // Step 3: Print clean results
        System.out.println("Full Name: " + fullName);
        System.out.println("Role: " + roleLower);
    }
}
