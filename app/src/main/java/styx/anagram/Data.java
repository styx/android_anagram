package styx.anagram;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class Data extends SQLiteAssetHelper {

    private static final String DATABASE_NAME = "data.db";
    private static final int DATABASE_VERSION = 1;
    private static final String[] columns = { "entity", "info" };
    private static final String sql_like = "entity LIKE '";
    private static SQLiteDatabase db = null;
    private static SQLiteQueryBuilder qb = null;

    public Data(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        db = getReadableDatabase();
        qb = new SQLiteQueryBuilder();
        qb.setTables("Dict");
    }

    public Cursor search_by_entity(String request) {
        String where = sql_like + request + "'";
        Cursor c = qb.query(db, columns, where, null,
                null, null, null);

        c.moveToFirst();
        return c;
    }

}