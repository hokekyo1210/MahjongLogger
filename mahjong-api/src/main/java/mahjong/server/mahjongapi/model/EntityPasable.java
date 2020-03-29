package mahjong.server.mahjongapi.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface EntityPasable<T> {
    public abstract List<T> parse(ResultSet rs) throws SQLException;
}
