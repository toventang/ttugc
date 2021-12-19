package androidx.p054j.p055a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;

/* renamed from: androidx.j.a.c */
public interface AbstractC1062c {

    /* renamed from: androidx.j.a.c$c */
    public interface AbstractC1066c {
        static {
            Covode.recordClassIndex(1159);
        }

        /* renamed from: a */
        AbstractC1062c mo3802a(C1064b bVar);
    }

    static {
        Covode.recordClassIndex(1155);
    }

    /* renamed from: a */
    AbstractC1061b mo3792a();

    /* renamed from: a */
    void mo3793a(boolean z);

    /* renamed from: androidx.j.a.c$b */
    public static class C1064b {

        /* renamed from: a */
        public final Context f3706a;

        /* renamed from: b */
        public final String f3707b;

        /* renamed from: c */
        public final AbstractC1063a f3708c;

        static {
            Covode.recordClassIndex(1157);
        }

        /* renamed from: androidx.j.a.c$b$a */
        public static class C1065a {

            /* renamed from: a */
            Context f3709a;

            /* renamed from: b */
            public String f3710b;

            /* renamed from: c */
            public AbstractC1063a f3711c;

            static {
                Covode.recordClassIndex(1158);
            }

            /* renamed from: a */
            public final C1064b mo3815a() {
                if (this.f3711c == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                } else if (this.f3709a != null) {
                    return new C1064b(this.f3709a, this.f3710b, this.f3711c);
                } else {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
            }

            C1065a(Context context) {
                this.f3709a = context;
            }
        }

        /* renamed from: a */
        public static C1065a m3606a(Context context) {
            return new C1065a(context);
        }

        C1064b(Context context, String str, AbstractC1063a aVar) {
            this.f3706a = context;
            this.f3707b = str;
            this.f3708c = aVar;
        }
    }

    /* renamed from: androidx.j.a.c$a */
    public static abstract class AbstractC1063a {

        /* renamed from: a */
        public final int f3705a;

        static {
            Covode.recordClassIndex(1156);
        }

        /* renamed from: a */
        public abstract void mo3811a(AbstractC1061b bVar);

        /* renamed from: a */
        public abstract void mo3812a(AbstractC1061b bVar, int i, int i2);

        /* renamed from: b */
        public void mo3813b(AbstractC1061b bVar) {
        }

        public AbstractC1063a(int i) {
            this.f3705a = i;
        }

        /* renamed from: a */
        public static void m3600a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                try {
                    int i = Build.VERSION.SDK_INT;
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: a */
        private static boolean m3601a(File file) {
            try {
                C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                }
                if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                    return false;
                }
            } catch (Throwable unused) {
            }
            return file.delete();
        }

        /* renamed from: b */
        public void mo3814b(AbstractC1061b bVar, int i, int i2) {
            throw new SQLiteException("Can't downgrade database from version " + i + " to " + i2);
        }
    }
}
