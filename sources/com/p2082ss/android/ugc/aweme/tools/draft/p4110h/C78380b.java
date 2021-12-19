package com.p2082ss.android.ugc.aweme.tools.draft.p4110h;

import android.text.format.DateFormat;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.tools.C77807b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.lang.reflect.Type;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.h.b */
public final class C78380b {

    /* renamed from: a */
    public static final C78380b f176120a = new C78380b();

    /* renamed from: b */
    private static final AbstractC89244h f176121b = C89250i.m154773a((AbstractC89171a) C78381a.f176122a);

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.h.b$b */
    static final class RunnableC78382b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C78379a f176123a;

        static {
            Covode.recordClassIndex(91508);
        }

        RunnableC78382b(C78379a aVar) {
            this.f176123a = aVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.draft.h.b$b$a */
        public static final class C78383a extends C27895a<List<? extends C78379a>> {
            static {
                Covode.recordClassIndex(91509);
            }

            C78383a() {
            }
        }

        public final void run() {
            C27910f G = C63244g.m114602a().mo73261G();
            String string = C78380b.m136882a().getString("db_event", "");
            if (string == null || string.length() == 0) {
                C78380b.m136882a().storeString("db_event", G.mo46674b(C89070n.m154516a(this.f176123a)));
                return;
            }
            Type type = new C78383a().type;
            Object a = G.mo46671a(string, type);
            C89219l.m154716b(a, "");
            List list = (List) a;
            list.add(0, this.f176123a);
            C78380b.m136882a().storeString("db_event", G.mo46675b(list, type));
        }
    }

    /* renamed from: a */
    public static Keva m136882a() {
        return (Keva) f176121b.getValue();
    }

    private C78380b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.h.b$a */
    static final class C78381a extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C78381a f176122a = new C78381a();

        static {
            Covode.recordClassIndex(91507);
        }

        C78381a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("aweme-draft-db-log");
        }
    }

    /* renamed from: b */
    static int m136887b() {
        return C63244g.m114602a().mo73295w().mo93779h();
    }

    static {
        Covode.recordClassIndex(91506);
    }

    /* renamed from: a */
    static void m136885a(C78379a aVar) {
        if (SettingsManager.m29616a().mo25400a("record_draft_db_log", true)) {
            C77807b.f174559a.execute(new RunnableC78382b(aVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static String m136884a(long j, String str) {
        if (j <= 0) {
            return "";
        }
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone(str));
        C89219l.m154716b(instance, "");
        instance.setTimeInMillis(j);
        return DateFormat.format("yyyy-MM-dd hh:mm:ss a", instance).toString();
    }

    /* renamed from: a */
    public static final void m136886a(String str, boolean z) {
        C89219l.m154721d(str, "");
        if (!z) {
            C84911q.m145922a("aweme-draft-monitor", str);
        }
    }
}
