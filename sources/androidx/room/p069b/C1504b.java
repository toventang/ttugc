package androidx.room.p069b;

import android.database.Cursor;
import androidx.p054j.p055a.AbstractC1061b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: androidx.room.b.b */
public final class C1504b {
    static {
        Covode.recordClassIndex(1643);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static void m5130a(AbstractC1061b bVar) {
        ArrayList<String> arrayList = new ArrayList();
        Cursor b = bVar.mo3782b("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (b.moveToNext()) {
            try {
                arrayList.add(b.getString(0));
            } catch (Throwable th) {
                b.close();
                throw th;
            }
        }
        b.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                bVar.mo3785c("DROP TRIGGER IF EXISTS ".concat(String.valueOf(str)));
            }
        }
    }
}
