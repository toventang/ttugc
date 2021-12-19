package dmt.p4542av.video.p4547d;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.video.d.a */
public final /* synthetic */ class C88249a {
    static {
        Covode.recordClassIndex(104284);
    }

    /* renamed from: a */
    public static final boolean m153359a(Activity activity) {
        long j;
        C89219l.m154721d(activity, "");
        if (!C80720e.m139939e()) {
            C84911q.m145926b("record check SD not available");
            new C79459a(activity).mo123050a(R.string.feu).mo123053a();
            return false;
        }
        long a = ((long) C16048b.m29633a().mo25412a(true, "record_min_disk_amount_mb", 20)) * 1024 * 1024;
        try {
            j = C80720e.m139940f();
        } catch (Exception unused) {
            j = 0;
        }
        if (j < a) {
            long j2 = a - j;
            if (j2 > 0 && !C63238c.f143576c.mo93770a(j2)) {
                C84911q.m145926b("RecordCheck disk space insufficient sdAvailableSize:" + j + " minDiskAmountByte:" + a);
                Context applicationContext = activity.getApplicationContext();
                if (C58003a.f132201c && applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
                new C79459a(applicationContext).mo123050a(R.string.b8k).mo123053a();
                return false;
            }
        }
        return true;
    }
}
