package com.p2082ss.android.ugc.aweme.bridge;

import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2368b.p2369a.C34505b;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.friends.AbstractC51435a;
import com.p2082ss.android.ugc.aweme.friends.model.UploadContactsResult;
import com.p2082ss.android.ugc.aweme.friends.service.FriendsServiceImpl;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.ufr.AbstractC79495a;
import com.p2082ss.android.ugc.aweme.ufr.C79515b;
import com.p2082ss.android.ugc.aweme.ufr.C79546d;
import com.p2082ss.android.ugc.aweme.ufr.EnumC79549g;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bridge.GetContactMethod */
public final class GetContactMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: c */
    public static final C34916a f82370c = new C34916a((byte) 0);

    /* renamed from: b */
    public AbstractC16183k.AbstractC16185b f82371b;

    /* renamed from: d */
    private final ArrayList<AbstractC88412b> f82372d = new ArrayList<>();

    /* renamed from: e */
    private final String f82373e = "getContacts";

    static {
        Covode.recordClassIndex(41927);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
        if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bridge.GetContactMethod$a */
    public static final class C34916a {
        static {
            Covode.recordClassIndex(41928);
        }

        private C34916a() {
        }

        public /* synthetic */ C34916a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82373e;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        for (T t : this.f82372d) {
            if (t != null && !t.isDisposed()) {
                t.dispose();
            }
        }
        this.f82372d.clear();
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume() {
        AbstractC16183k.AbstractC16185b bVar = this.f82371b;
        if (bVar != null && FriendsServiceImpl.m96115u().mo87322d().mo86983b()) {
            ((AbstractC51435a) C34505b.m70490a(mo26893e(), AbstractC51435a.class)).mo60945a(false);
            Context e = mo26893e();
            if (e == null) {
                C89219l.m154715b();
            }
            m71294a(e, bVar);
        }
        this.f82371b = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bridge.GetContactMethod$c */
    public static final class C34918c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC16183k.AbstractC16185b f82376a;

        static {
            Covode.recordClassIndex(41930);
        }

        C34918c(AbstractC16183k.AbstractC16185b bVar) {
            this.f82376a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C34927a.m71313a(this.f82376a, (Throwable) obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bridge.GetContactMethod$b */
    public static final class C34917b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ GetContactMethod f82374a;

        /* renamed from: b */
        final /* synthetic */ AbstractC16183k.AbstractC16185b f82375b;

        static {
            Covode.recordClassIndex(41929);
        }

        C34917b(GetContactMethod getContactMethod, AbstractC16183k.AbstractC16185b bVar) {
            this.f82374a = getContactMethod;
            this.f82375b = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            UploadContactsResult uploadContactsResult = (UploadContactsResult) obj;
            AbstractC16183k.AbstractC16185b bVar = this.f82375b;
            C89219l.m154716b(uploadContactsResult, "");
            C34927a.m71314a(bVar, GetContactMethod.m71293a(true, (List<? extends User>) uploadContactsResult.users));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetContactMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bridge.GetContactMethod$d */
    public static final class C34919d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ GetContactMethod f82377a;

        /* renamed from: b */
        final /* synthetic */ AbstractC16183k.AbstractC16185b f82378b;

        static {
            Covode.recordClassIndex(41931);
        }

        C34919d(GetContactMethod getContactMethod, AbstractC16183k.AbstractC16185b bVar) {
            this.f82377a = getContactMethod;
            this.f82378b = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C79546d dVar = (C79546d) obj;
            if (dVar.f178516a == EnumC79549g.REQUEST_ACTUAL_PERMISSION || dVar.f178516a == EnumC79549g.REQUEST_UID_PERMISSION) {
                if (dVar.f178517b.f178518a) {
                    this.f82377a.mo61806a(this.f82378b);
                } else if (dVar.f178517b.f178520c == 1) {
                    this.f82377a.f82371b = this.f82378b;
                } else {
                    C34927a.m71314a(this.f82378b, GetContactMethod.m71293a(false, (List<? extends User>) null));
                }
            } else if (dVar.f178516a != EnumC79549g.SYNC_STATUS || !dVar.f178517b.f178518a) {
                C34927a.m71313a(this.f82378b, (Throwable) null);
            } else {
                this.f82377a.mo61806a(this.f82378b);
            }
        }
    }

    /* renamed from: a */
    public final void mo61806a(AbstractC16183k.AbstractC16185b bVar) {
        this.f82372d.add(FriendsServiceImpl.m96115u().mo87314b(1).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143254a(new C34917b(this, bVar), new C34918c(bVar)));
    }

    /* renamed from: a */
    private final void m71294a(Context context, AbstractC16183k.AbstractC16185b bVar) {
        Class<? extends AbstractC79495a> c = FriendsServiceImpl.m96115u().mo87320c();
        User b = C80580in.m139683b();
        C89219l.m154716b(b, "");
        this.f82372d.add(C79515b.m138229a(context, c, b.getUid(), "enter_from", "enter_method", true, false, null).mo143289d(new C34919d(this, bVar)));
    }

    /* renamed from: a */
    public static JSONObject m71293a(boolean z, List<? extends User> list) {
        boolean z2;
        String str;
        JSONObject put = new JSONObject().put("hasPermission", z);
        if (list == null || list.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            put.put("contacts", new JSONArray());
        } else {
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            for (T t : list) {
                JSONObject put2 = new JSONObject().put("uid", t.getUid()).put("secUid", t.getSecUid()).put("uniqueId", t.getUniqueId()).put("username", t.getUserDisplayName());
                UrlModel avatarThumb = t.getAvatarThumb();
                C89219l.m154716b(avatarThumb, "");
                List<String> urlList = avatarThumb.getUrlList();
                C89219l.m154716b(urlList, "");
                if (C89070n.m154517a((List) urlList) >= 0) {
                    str = urlList.get(0);
                } else {
                    str = "";
                }
                arrayList.add(put2.put("avatarUrl", str).put("relation", t.getFollowStatus()));
            }
            put.put("contacts", JSONObject.wrap(arrayList));
        }
        C89219l.m154716b(put, "");
        return put;
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k
    /* renamed from: a */
    public final void mo25748a(JSONObject jSONObject, AbstractC16183k.AbstractC16185b bVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(bVar, "");
        Context e = mo26893e();
        if (e != null) {
            if (FriendsServiceImpl.m96115u().mo87322d().mo86984c()) {
                mo61806a(bVar);
                return;
            }
            for (T t : this.f82372d) {
                if (t != null && !t.isDisposed()) {
                    t.dispose();
                }
            }
            this.f82372d.clear();
            m71294a(e, bVar);
        }
    }
}
