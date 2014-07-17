package styx.anagram;

import android.content.Context;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class Data extends SQLiteAssetHelper {

    private static final String DATABASE_NAME = "data.db.gz";
    private static final int DATABASE_VERSION = 1;

    public Data(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
}
