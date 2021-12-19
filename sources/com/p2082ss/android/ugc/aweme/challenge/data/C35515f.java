package com.p2082ss.android.ugc.aweme.challenge.data;

import androidx.room.AbstractC1533j;
import androidx.room.C1532i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.p2141e.AbstractC29907c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.challenge.data.f */
public class C35515f {

    /* renamed from: a */
    private static final String f83753a = C35515f.class.getSimpleName();

    /* renamed from: b */
    private static AbstractC29907c<LocalHashTagDataBase> f83754b = new AbstractC29907c<LocalHashTagDataBase>() {
        /* class com.p2082ss.android.ugc.aweme.challenge.data.C35515f.C355161 */

        static {
            Covode.recordClassIndex(42710);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.p2082ss.android.p2141e.AbstractC29907c
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ LocalHashTagDataBase mo52218a() {
            AbstractC1533j.C1534a a = C1532i.m5166a(C17867d.m33078a(), LocalHashTagDataBase.class, "localHashTag.db");
            a.f5046b = true;
            return a.mo5096a();
        }
    };

    static {
        Covode.recordClassIndex(42709);
    }

    /* renamed from: a */
    public static List<C35514e> m72611a() {
        try {
            LocalHashTagDataBase b = f83754b.mo52219b();
            if (b != null) {
                return b.mo62407i().mo62410a();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
