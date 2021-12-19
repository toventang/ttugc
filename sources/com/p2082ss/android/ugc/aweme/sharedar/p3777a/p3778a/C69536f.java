package com.p2082ss.android.ugc.aweme.sharedar.p3777a.p3778a;

import android.app.Dialog;
import android.content.DialogInterface;
import android.net.Uri;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.sharedar.C69548c;
import com.p2082ss.android.ugc.aweme.sharedar.C69568g;
import com.p2082ss.android.ugc.aweme.sharedar.network.API;
import com.p2082ss.android.ugc.aweme.sharedar.network.C69572a;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.tools.view.widget.C85041d;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.sharedar.a.a.f */
public final class C69536f extends AbstractC69514a {

    /* renamed from: b */
    static final /* synthetic */ AbstractC89286i[] f155340b = {new C89232y(C69536f.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0), new C89232y(C69536f.class, "manager", "getManager()Lcom/ss/android/ugc/aweme/sharedar/SharedAREffectManager;", 0)};

    /* renamed from: d */
    public static final C69537a f155341d = new C69537a((byte) 0);

    /* renamed from: c */
    public boolean f155342c;

    /* renamed from: e */
    private final AbstractC89248d f155343e = C21572a.m40504a(getDiContainer(), ActivityC0945e.class);

    /* renamed from: f */
    private final AbstractC89248d f155344f = C21572a.m40504a(getDiContainer(), C69548c.class);

    static {
        Covode.recordClassIndex(81878);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharedar.p3777a.p3778a.AbstractC69514a
    /* renamed from: a */
    public final long mo109765a() {
        return 1;
    }

    /* renamed from: b */
    public final ActivityC0945e mo109779b() {
        return (ActivityC0945e) this.f155343e.mo23374a(this, f155340b[0]);
    }

    /* renamed from: c */
    public final C69548c mo109780c() {
        return (C69548c) this.f155344f.mo23374a(this, f155340b[1]);
    }

    /* renamed from: com.ss.android.ugc.aweme.sharedar.a.a.f$a */
    public static final class C69537a {
        static {
            Covode.recordClassIndex(81879);
        }

        private C69537a() {
        }

        public /* synthetic */ C69537a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharedar.a.a.f$b */
    static final class C69538b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C69536f f155345a;

        /* renamed from: b */
        final /* synthetic */ String f155346b;

        static {
            Covode.recordClassIndex(81880);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69538b(C69536f fVar, String str) {
            super(0);
            this.f155345a = fVar;
            this.f155346b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            Dialog a = C63253l.f143623a.mo73328x().mo109763a(this.f155345a.mo109779b(), new C69540a(this));
            a.setOnDismissListener(new DialogInterface.OnDismissListener(this) {
                /* class com.p2082ss.android.ugc.aweme.sharedar.p3777a.p3778a.C69536f.C69538b.DialogInterface$OnDismissListenerC695391 */

                /* renamed from: a */
                final /* synthetic */ C69538b f155347a;

                static {
                    Covode.recordClassIndex(81881);
                }

                {
                    this.f155347a = r1;
                }

                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f155347a.f155345a.f155342c = false;
                }
            });
            a.show();
            return C89391z.f203057a;
        }

        /* renamed from: com.ss.android.ugc.aweme.sharedar.a.a.f$b$a */
        static final class C69540a extends AbstractC89220m implements AbstractC89172b<C69568g, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C69538b f155348a;

            static {
                Covode.recordClassIndex(81882);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C69540a(C69538b bVar) {
                super(1);
                this.f155348a = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C69568g gVar) {
                C69568g gVar2 = gVar;
                C89219l.m154721d(gVar2, "");
                gVar2.f155392a = false;
                gVar2.f155393b = new AbstractC89172b<List<? extends User>, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.sharedar.p3777a.p3778a.C69536f.C69538b.C69540a.C695411 */

                    /* renamed from: a */
                    final /* synthetic */ C69540a f155349a;

                    static {
                        Covode.recordClassIndex(81883);
                    }

                    {
                        this.f155349a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(List<? extends User> list) {
                        List<? extends User> list2 = list;
                        C89219l.m154721d(list2, "");
                        User user = (User) C89070n.m154579f((List) list2);
                        C69548c c = this.f155349a.f155348a.f155345a.mo109780c();
                        C89219l.m154721d(user, "");
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("sec_uid", user.getSecUid());
                        jSONObject.put("uid", user.getUid());
                        c.mo109789c().mo109791a(16385, 3, 0, jSONObject.toString());
                        this.f155349a.f155348a.f155345a.mo109778a(user, this.f155349a.f155348a.f155346b);
                        return C89391z.f203057a;
                    }
                };
                return C89391z.f203057a;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sharedar.a.a.f$c */
    public static final class C69542c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C69536f f155350a;

        /* renamed from: b */
        final /* synthetic */ User f155351b;

        /* renamed from: c */
        final /* synthetic */ String f155352c;

        static {
            Covode.recordClassIndex(81884);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69542c(C69536f fVar, User user, String str) {
            super(0);
            this.f155350a = fVar;
            this.f155351b = user;
            this.f155352c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            JSONArray put = new JSONArray().put(this.f155351b.getUid());
            JSONObject jSONObject = new JSONObject();
            C69536f fVar = this.f155350a;
            String uri = new Uri.Builder().scheme("aweme").authority("openShoot").appendQueryParameter(StringSet.type, "use_sticker").appendQueryParameter("sticker_id", fVar.mo109780c().mo109790d().getEffect_id()).appendQueryParameter("session", this.f155352c).appendQueryParameter("host_uid", C63244g.m114602a().mo73255A().mo93904c()).build().toString();
            C89219l.m154716b(uri, "");
            C84911q.m145922a("SharedAR", "schema: ".concat(String.valueOf(uri)));
            jSONObject.put("schema", uri);
            jSONObject.put("notice_type", "shared_ar_effect");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String jSONArray = put.toString();
            C89219l.m154716b(jSONArray, "");
            linkedHashMap.put("receiver_ids", jSONArray);
            String jSONObject2 = jSONObject.toString();
            C89219l.m154716b(jSONObject2, "");
            linkedHashMap.put("notice_content", C89361p.m154868a(jSONObject2, "\\", ""));
            final C89233z.C89234a aVar = new C89233z.C89234a();
            aVar.element = false;
            try {
                T t = ((API) C69572a.f155396a.getValue()).inviteFriend(linkedHashMap).execute().f52262b;
                if (t.status_code == 0) {
                    aVar.element = true;
                }
                C84911q.m145922a("SharedAR", "invite friend response: ".concat(String.valueOf(t)));
            } catch (Exception e) {
                C84911q.m145923a("SharedAR", e);
            }
            this.f155350a.mo109767b(new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.sharedar.p3777a.p3778a.C69536f.C69542c.C695431 */

                /* renamed from: a */
                final /* synthetic */ C69542c f155353a;

                static {
                    Covode.recordClassIndex(81885);
                }

                {
                    this.f155353a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    int i;
                    String str;
                    ActivityC0945e b = this.f155353a.f155350a.mo109779b();
                    ActivityC0945e b2 = this.f155353a.f155350a.mo109779b();
                    if (aVar.element) {
                        i = R.string.fsh;
                    } else {
                        i = R.string.fsl;
                    }
                    Object[] objArr = new Object[1];
                    User user = this.f155353a.f155351b;
                    C89219l.m154721d(user, "");
                    String uniqueId = user.getUniqueId();
                    if (uniqueId == null || uniqueId.length() == 0) {
                        str = user.getShortId();
                        C89219l.m154716b(str, "");
                    } else {
                        str = user.getUniqueId();
                        C89219l.m154716b(str, "");
                    }
                    objArr[0] = str;
                    C85041d.m146227b(b, b2.getString(i, objArr), 0).mo129984b();
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69536f(C21582f fVar) {
        super(fVar);
        C89219l.m154721d(fVar, "");
    }

    /* renamed from: a */
    public final void mo109778a(User user, String str) {
        m122727a(new C69542c(this, user, str));
    }

    @Override // com.p2082ss.android.ugc.aweme.sharedar.p3777a.p3778a.AbstractC69514a
    /* renamed from: a */
    public final void mo109766a(int i, long j, String str) {
        String optString;
        if (str != null && !this.f155342c && (optString = new JSONObject(str).optString("session_url")) != null && optString.length() != 0) {
            this.f155342c = true;
            mo109767b(new C69538b(this, optString));
            mo109780c().mo109788a(i, 2, j, "");
        }
    }
}
