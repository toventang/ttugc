package com.p2082ss.android.ugc.aweme.effect.p2891c;

import android.app.Activity;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.view.widget.C85041d;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effect.c.c */
public final class C46349c implements MessageCenter.Listener {

    /* renamed from: f */
    public static final C46350a f108039f = new C46350a((byte) 0);

    /* renamed from: a */
    public int f108040a;

    /* renamed from: b */
    public boolean f108041b;

    /* renamed from: c */
    public HashMap<Integer, C46343b> f108042c = new HashMap<>();

    /* renamed from: d */
    public int f108043d;

    /* renamed from: e */
    public final Activity f108044e;

    static {
        Covode.recordClassIndex(54926);
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.c.c$a */
    public static final class C46350a {
        static {
            Covode.recordClassIndex(54927);
        }

        private C46350a() {
        }

        public /* synthetic */ C46350a(byte b) {
            this();
        }
    }

    public C46349c(Activity activity) {
        C89219l.m154721d(activity, "");
        this.f108044e = activity;
    }

    /* renamed from: a */
    public final void mo78847a(int i) {
        MessageCenter.removeListener(this);
        this.f108041b = false;
        this.f108040a = 0;
        for (Map.Entry<Integer, C46343b> entry : this.f108042c.entrySet()) {
            if (entry.getKey().intValue() == i) {
                entry.getValue().f108026b = false;
                entry.getValue().f108025a = 0;
            }
        }
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (i == 81) {
            String.valueOf(this.f108040a);
            for (Map.Entry<Integer, C46343b> entry : this.f108042c.entrySet()) {
                if (entry.getKey().intValue() == this.f108043d) {
                    entry.getValue().f108025a++;
                }
            }
            C46343b bVar = this.f108042c.get(Integer.valueOf(this.f108043d));
            if (bVar != null && bVar.f108025a == 3 && !bVar.f108027c) {
                C85041d.m146220a(this.f108044e, (int) R.string.d4r).mo129984b();
                bVar.f108027c = true;
                this.f108042c.put(Integer.valueOf(this.f108043d), bVar);
            }
        }
    }
}
