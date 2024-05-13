if(s.length()<=1 || s.charAt(0)==s.charAt(1))
            return "NO";
        // System.out.println(s.length());
        String str = "";
        for(int i=s.length()-1;i>=0;i--){
            str+=s.charAt(i);
        }
        int left = 0,right=s.length()-1;
        boolean check = false;
        while(left<=right){
            if(str.charAt(left)==s.charAt(right))
                check = true;
            else{
                check = false;
                break;
            }
            left++;
            right--;
        }
        return check?"YES":"NO";
    }