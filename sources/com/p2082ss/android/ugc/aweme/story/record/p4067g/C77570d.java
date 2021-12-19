package com.p2082ss.android.ugc.aweme.story.record.p4067g;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.record.g.d */
public final class C77570d {

    /* renamed from: a */
    public static Dialog f173974a;

    /* renamed from: b */
    public static final C77570d f173975b = new C77570d();

    private C77570d() {
    }

    static {
        Covode.recordClassIndex(90607);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.g.d$c */
    public static final class DialogInterface$OnDismissListenerC77573c implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        public static final DialogInterface$OnDismissListenerC77573c f173979a = new DialogInterface$OnDismissListenerC77573c();

        static {
            Covode.recordClassIndex(90610);
        }

        DialogInterface$OnDismissListenerC77573c() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            C77570d.f173974a = null;
        }
    }

    /* renamed from: a */
    public static boolean m135569a(Context context) {
        C89219l.m154721d(context, "");
        Collection<Integer> values = m135570b(context).values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                if (it.next().intValue() != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    public static Map<String, Integer> m135570b(Context context) {
        C89219l.m154721d(context, "");
        return C89041ag.m154421a(C89387v.m154943a("camera", Integer.valueOf(C63253l.f143623a.mo73307c().mo101673b(context))), C89387v.m154943a(DataType.AUDIO, Integer.valueOf(C63253l.f143623a.mo73307c().mo101674c(context))), C89387v.m154943a("storage", Integer.valueOf(C63253l.f143623a.mo73307c().mo101757a(context))));
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.g.d$a */
    public static final class DialogInterface$OnClickListenerC77571a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f173976a;

        static {
            Covode.recordClassIndex(90608);
        }

        public DialogInterface$OnClickListenerC77571a(AbstractC89171a aVar) {
            this.f173976a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f173976a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.g.d$b */
    public static final class DialogInterface$OnClickListenerC77572b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Context f173977a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f173978b;

        static {
            Covode.recordClassIndex(90609);
        }

        public DialogInterface$OnClickListenerC77572b(Context context, AbstractC89171a aVar) {
            this.f173977a = context;
            this.f173978b = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            C63253l.f143623a.mo73307c().mo101675d(this.f173977a);
            this.f173978b.invoke();
        }
    }
}
