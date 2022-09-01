package Service;

import Model.Monster;
import Util.ConnectionUtil;

import java.sql.*;

public class MonsterService {
    Connection conn;

    public MonsterService() {
        conn = ConnectionUtil.getConnection();
    }

    public int chooseMonster(int roll) {

        if (roll <= 2) {
            //Create Dark Knight
            return 1;
        } else if (roll <=8) {
            //Create Bandit
            return 2;
        } else if (roll <=14) {
            //Create Goblin
            return 3;
        } else {
            //Create Green Slime
            return 4;
        }

    }
    public Monster createMonster(int monsterid) {
        try {
            PreparedStatement ps = conn.prepareStatement("select * from monster where id = ?");
            ps.setInt(1,monsterid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Monster m = new Monster(rs.getString("name"),rs.getInt("hp"),rs.getInt("ac"),rs.getInt("atk"),rs.getInt("addatk"),rs.getInt("addroll"));
                return m;
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;

    }
}
