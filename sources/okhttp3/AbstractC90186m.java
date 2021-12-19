package okhttp3;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.List;

/* renamed from: okhttp3.m */
public interface AbstractC90186m {

    /* renamed from: a */
    public static final AbstractC90186m f204834a = new AbstractC90186m() {
        /* class okhttp3.AbstractC90186m.C901871 */

        static {
            Covode.recordClassIndex(106360);
        }

        @Override // okhttp3.AbstractC90186m
        public final void saveFromResponse(C90200t tVar, List<C90184l> list) {
        }

        @Override // okhttp3.AbstractC90186m
        public final List<C90184l> loadForRequest(C90200t tVar) {
            return Collections.emptyList();
        }
    };

    List<C90184l> loadForRequest(C90200t tVar);

    void saveFromResponse(C90200t tVar, List<C90184l> list);

    static {
        Covode.recordClassIndex(106359);
    }
}
