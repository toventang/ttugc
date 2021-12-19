package dmt.p4542av.video;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.C84401c;

/* renamed from: dmt.av.video.e */
public class C88252e<T> implements AbstractC1214u<T> {

    /* renamed from: a */
    static boolean f200293a = C84401c.f188718b;

    static {
        Covode.recordClassIndex(104287);
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public void onChanged(T t) {
        String obj;
        if (!f200293a) {
            if (t == null) {
                obj = "null";
            } else {
                obj = t.toString();
            }
            C84401c.f188722f.mo123658a(obj);
        }
    }
}
