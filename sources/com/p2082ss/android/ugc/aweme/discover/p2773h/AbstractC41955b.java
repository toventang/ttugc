package com.p2082ss.android.ugc.aweme.discover.p2773h;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.helper.AbstractC42021i;
import com.p2082ss.android.ugc.aweme.discover.helper.AbstractC42023j;
import com.p2082ss.android.ugc.aweme.discover.helper.AbstractC42024k;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2793e.AbstractC42367a;
import com.p2082ss.android.ugc.aweme.discover.model.Position;
import com.p2082ss.android.ugc.aweme.music.model.MusicTag;
import com.p2082ss.android.ugc.aweme.search.p3691g.AbstractC67440e;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67437b;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.discover.h.b */
public interface AbstractC41955b {

    /* renamed from: a */
    public static final C41956a f97845a = C41956a.f97846a;

    static {
        Covode.recordClassIndex(49882);
    }

    /* renamed from: a */
    SpannableString mo71105a(Context context, String str, List<? extends Position> list);

    /* renamed from: a */
    Fragment mo71106a(String str, boolean z, AbstractC67440e eVar);

    /* renamed from: a */
    AbstractC41954a mo71107a(ViewGroup viewGroup);

    /* renamed from: a */
    AbstractC41957c mo71108a();

    /* renamed from: a */
    AbstractC42024k mo71109a(AbstractC42024k.C42026b bVar);

    /* renamed from: a */
    void mo71110a(ActivityC0945e eVar, Fragment fragment, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, Map<String, String> map);

    /* renamed from: a */
    void mo71111a(RecyclerView recyclerView, List<MusicTag> list, View.OnClickListener onClickListener);

    /* renamed from: a */
    void mo71112a(AbstractC42021i.C42022a aVar);

    /* renamed from: a */
    void mo71113a(C67437b bVar, Fragment fragment);

    /* renamed from: a */
    void mo71114a(String str, Fragment fragment);

    /* renamed from: a */
    void mo71115a(String str, MusicModel musicModel, int i);

    /* renamed from: a */
    void mo71116a(String str, MusicModel musicModel, int i, String str2);

    /* renamed from: a */
    boolean mo71117a(String str);

    /* renamed from: b */
    AbstractC42023j mo71118b();

    /* renamed from: b */
    AbstractC42367a mo71119b(ViewGroup viewGroup);

    /* renamed from: c */
    RecyclerView.ViewHolder mo71120c(ViewGroup viewGroup);

    /* renamed from: c */
    boolean mo71121c();

    /* renamed from: d */
    RecyclerView.ViewHolder mo71122d(ViewGroup viewGroup);

    /* renamed from: com.ss.android.ugc.aweme.discover.h.b$a */
    public static final class C41956a {

        /* renamed from: a */
        static final /* synthetic */ C41956a f97846a = new C41956a();

        private C41956a() {
        }

        static {
            Covode.recordClassIndex(49883);
        }
    }
}
