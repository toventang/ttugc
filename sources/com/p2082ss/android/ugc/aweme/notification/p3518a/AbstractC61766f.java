package com.p2082ss.android.ugc.aweme.notification.p3518a;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.a.f */
public interface AbstractC61766f {
    static {
        Covode.recordClassIndex(72499);
    }

    /* renamed from: a */
    RecyclerView.ViewHolder mo99865a(ViewGroup viewGroup);

    /* renamed from: a */
    String mo99866a();

    /* renamed from: a */
    List<BaseNotice> mo99867a(List<BaseNotice> list);

    /* renamed from: a */
    void mo99868a(RecyclerView.ViewHolder viewHolder, BaseNotice baseNotice, int i, HashMap<String, BaseNotice> hashMap);

    /* renamed from: b */
    String mo99869b();

    /* renamed from: c */
    String mo99870c();

    /* renamed from: com.ss.android.ugc.aweme.notification.a.f$a */
    public static final class C61767a {
        static {
            Covode.recordClassIndex(72500);
        }

        /* renamed from: a */
        public static String m111816a() {
            String string = C17867d.m33078a().getString(R.string.cvn);
            C89219l.m154716b(string, "");
            return string;
        }
    }
}
