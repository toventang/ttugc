package com.p2082ss.android.ugc.aweme.comment.services;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.OnActivityResultCallback;
import com.p2082ss.android.ugc.aweme.comment.api.AbstractC36272e;
import com.p2082ss.android.ugc.aweme.comment.api.CommentViewModel;
import com.p2082ss.android.ugc.aweme.comment.model.CommentRethinkPopup;
import com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36418d;
import com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36430c;
import com.p2082ss.android.ugc.aweme.comment.p2495i.C36491b;
import com.p2082ss.android.ugc.aweme.comment.p2495i.C36500h;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38255s;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.p3538o.AbstractC62694c;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import java.util.List;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.comment.services.CommentService */
public interface CommentService {

    /* renamed from: a */
    public static final C36951a f87014a = C36951a.f87015a;

    static {
        Covode.recordClassIndex(44295);
    }

    /* renamed from: a */
    LiveData<Aweme> mo63276a(AbstractC1196i iVar);

    /* renamed from: a */
    CommentViewModel mo63277a(ActivityC0945e eVar);

    /* renamed from: a */
    AbstractC36413a mo63278a(View view, AbstractC0952i iVar, String str, AbstractC36952a aVar, AbstractC36430c cVar);

    /* renamed from: a */
    AbstractC36418d mo63279a(Activity activity, Aweme aweme, C36500h hVar);

    /* renamed from: a */
    C38255s mo63280a(Aweme aweme);

    /* renamed from: a */
    AbstractC62694c mo63281a(C36491b bVar);

    /* renamed from: a */
    List<TextExtraStruct> mo63282a(Context context, Aweme aweme, C38255s sVar);

    /* renamed from: a */
    List<TextExtraStruct> mo63283a(C38255s sVar);

    /* renamed from: a */
    List<TextExtraStruct> mo63284a(C38255s sVar, AwemeRawAd awemeRawAd, AbstractC89171a<C89391z> aVar);

    /* renamed from: a */
    void mo63285a();

    /* renamed from: a */
    void mo63286a(Activity activity, String str, String str2, String str3, int i);

    /* renamed from: a */
    void mo63287a(Context context, int i, String str);

    /* renamed from: a */
    void mo63288a(Context context, QaStruct qaStruct, String str, String str2, String str3);

    /* renamed from: a */
    void mo63289a(Context context, String str, Aweme aweme, int i, List<InteractionTagUserInfo> list, OnActivityResultCallback onActivityResultCallback);

    /* renamed from: a */
    void mo63290a(ActivityC0945e eVar, Aweme aweme, String str, String str2);

    /* renamed from: a */
    void mo63291a(ActivityC0945e eVar, boolean z, AbstractC89171a<C89391z> aVar);

    /* renamed from: a */
    void mo63292a(AbstractC0952i iVar, CommentRethinkPopup commentRethinkPopup, AbstractC89171a<C89391z> aVar, AbstractC89171a<C89391z> aVar2, AbstractC89171a<C89391z> aVar3, String str);

    /* renamed from: a */
    void mo63293a(String str);

    /* renamed from: a */
    void mo63294a(String str, Aweme aweme, JSONObject jSONObject, String str2);

    /* renamed from: a */
    void mo63295a(String str, Integer num, int i, String str2, String str3);

    /* renamed from: a */
    void mo63296a(String str, String str2);

    /* renamed from: a */
    boolean mo63297a(Context context);

    /* renamed from: b */
    AbstractC36272e mo63298b(ActivityC0945e eVar);

    /* renamed from: b */
    AbstractC36413a mo63299b(View view, AbstractC0952i iVar, String str, AbstractC36952a aVar, AbstractC36430c cVar);

    /* renamed from: b */
    String mo63300b(C38255s sVar);

    /* renamed from: b */
    String mo63301b(String str);

    /* renamed from: b */
    void mo63302b();

    /* renamed from: b */
    void mo63303b(Context context);

    /* renamed from: b */
    boolean mo63304b(Aweme aweme);

    /* renamed from: c */
    AbstractC58264w mo63305c();

    /* renamed from: c */
    void mo63306c(Context context);

    /* renamed from: c */
    boolean mo63307c(Aweme aweme);

    /* renamed from: d */
    boolean mo63308d();

    /* renamed from: com.ss.android.ugc.aweme.comment.services.CommentService$a */
    public static final class C36951a {

        /* renamed from: a */
        static final /* synthetic */ C36951a f87015a = new C36951a();

        private C36951a() {
        }

        static {
            Covode.recordClassIndex(44296);
        }
    }
}
