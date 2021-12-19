package com.p2082ss.android.ugc.aweme.search;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.google.gson.C27917g;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.p2082ss.android.sdk.webview.C30248e;
import com.p2082ss.android.ugc.aweme.discover.helper.AbstractC42020h;
import com.p2082ss.android.ugc.aweme.discover.mob.ISearchResultStatistics;
import com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41955b;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42639ae;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42640af;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.AbstractC51187d;
import com.p2082ss.android.ugc.aweme.keyword.AbstractC57066a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.model.C67674b;
import com.p2082ss.android.ugc.aweme.search.model.C67677c;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.model.FeedSearchIconViewModel;
import com.p2082ss.android.ugc.aweme.search.p3686d.AbstractC67363b;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.search.ISearchService */
public interface ISearchService {
    static {
        Covode.recordClassIndex(78960);
    }

    /* renamed from: a */
    Intent mo106187a(Activity activity, Uri uri);

    /* renamed from: a */
    JediSimpleViewHolder<?> mo106188a(ViewGroup viewGroup, ActivityC0945e eVar);

    /* renamed from: a */
    LynxUI<?> mo106189a(AbstractC28520j jVar);

    /* renamed from: a */
    AbstractC42639ae mo106190a(C67678d dVar, AbstractC57066a.AbstractC57067a aVar, AbstractC51187d dVar2, AbstractC67363b bVar, String str);

    /* renamed from: a */
    AbstractC42640af mo106191a(boolean z);

    /* renamed from: a */
    FeedSearchIconViewModel mo106192a(ActivityC0945e eVar);

    /* renamed from: a */
    String mo106193a(User user, Context context);

    /* renamed from: a */
    List<AbstractC16183k> mo106194a(C16248b bVar);

    /* renamed from: a */
    void mo106195a();

    /* renamed from: a */
    void mo106196a(int i);

    /* renamed from: a */
    void mo106197a(int i, String str, int i2, String str2, String str3, String str4);

    /* renamed from: a */
    void mo106198a(AbstractC1204m mVar, String str, Map<String, String> map);

    /* renamed from: a */
    void mo106199a(C27917g gVar);

    /* renamed from: a */
    void mo106200a(C30248e eVar, WeakReference<Context> weakReference);

    /* renamed from: a */
    void mo106201a(C67677c cVar);

    /* renamed from: a */
    void mo106202a(C67678d dVar);

    /* renamed from: a */
    void mo106203a(Exception exc, String str);

    /* renamed from: a */
    void mo106204a(String str, String str2, String str3, boolean z);

    /* renamed from: a */
    void mo106205a(JSONObject jSONObject);

    /* renamed from: a */
    void mo106206a(boolean z, List<? extends Aweme> list, int i);

    /* renamed from: a */
    boolean mo106207a(Activity activity);

    /* renamed from: b */
    LynxUI<?> mo106208b(AbstractC28520j jVar);

    /* renamed from: b */
    void mo106209b();

    /* renamed from: b */
    void mo106210b(C67678d dVar);

    /* renamed from: b */
    void mo106211b(boolean z);

    /* renamed from: c */
    LynxUI<?> mo106212c(AbstractC28520j jVar);

    /* renamed from: c */
    ISearchResultStatistics mo106213c();

    /* renamed from: c */
    void mo106214c(boolean z);

    /* renamed from: d */
    AbstractC67366e mo106215d();

    /* renamed from: e */
    C67674b mo106216e();

    /* renamed from: f */
    AbstractC41955b mo106217f();

    /* renamed from: g */
    Fragment mo106218g();

    /* renamed from: h */
    boolean mo106219h();

    /* renamed from: i */
    boolean mo106220i();

    /* renamed from: j */
    boolean mo106221j();

    /* renamed from: k */
    boolean mo106222k();

    /* renamed from: l */
    boolean mo106223l();

    /* renamed from: m */
    void mo106224m();

    /* renamed from: n */
    AbstractC42020h mo106225n();

    /* renamed from: o */
    boolean mo106226o();

    /* renamed from: p */
    Map<String, String> mo106227p();

    /* renamed from: q */
    boolean mo106228q();

    /* renamed from: r */
    AbstractC88979t<?> mo106229r();

    /* renamed from: s */
    boolean mo106230s();
}
