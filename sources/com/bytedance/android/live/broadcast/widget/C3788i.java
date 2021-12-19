package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.Spannable;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.user.C2993a;
import com.bytedance.android.live.broadcast.api.p187e.AbstractC3063c;
import com.bytedance.android.live.broadcast.model.C3273p;
import com.bytedance.android.live.broadcast.utils.C3719d;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.live.p379n.AbstractC5773g;
import com.bytedance.android.livesdk.chatroom.p491f.C7557c;
import com.bytedance.android.livesdk.model.message.C9688bt;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11275l;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;

/* renamed from: com.bytedance.android.live.broadcast.widget.i */
public final class C3788i implements AbstractC3063c, AbstractC5773g.AbstractC5774a {

    /* renamed from: e */
    private static int f10505e = 1;

    /* renamed from: f */
    private static int f10506f = 1;

    /* renamed from: g */
    private static int f10507g = 750;

    /* renamed from: h */
    private static int f10508h = 750;

    /* renamed from: a */
    long f10509a;

    /* renamed from: b */
    Context f10510b;

    /* renamed from: c */
    AbstractC5773g f10511c;

    /* renamed from: d */
    public final C88411a f10512d = new C88411a();

    /* renamed from: i */
    private Room f10513i;

    /* renamed from: j */
    private long f10514j;

    /* renamed from: k */
    private int f10515k;

    /* renamed from: l */
    private DialogInterface.OnClickListener f10516l = new DialogInterface$OnClickListenerC3791j(this);

    /* renamed from: m */
    private DialogInterface.OnClickListener f10517m = new DialogInterface$OnClickListenerC3792k(this);

    @Override // com.bytedance.android.live.p379n.AbstractC5773g.AbstractC5774a
    /* renamed from: a */
    public final void mo9127a() {
        this.f10511c.mo11515b();
        this.f10512d.dispose();
    }

    @Override // com.bytedance.android.live.broadcast.api.p187e.AbstractC3063c
    /* renamed from: e_ */
    public final void mo8328e_() {
        this.f10512d.dispose();
        AbstractC5773g gVar = this.f10511c;
        if (gVar != null) {
            gVar.mo11515b();
        }
    }

    static {
        Covode.recordClassIndex(4314);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final HashMap<String, String> mo9132b() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("room_id", String.valueOf(this.f10509a));
        hashMap.put("anchor_id", String.valueOf(this.f10514j));
        return hashMap;
    }

    /* renamed from: a */
    public final void mo9131a(Throwable th) {
        String string;
        if (th instanceof FileNotFoundException) {
            string = this.f10510b.getString(R.string.guc);
        } else if (th instanceof C2912a) {
            string = ((C2912a) th).getErrorMsg();
        } else {
            string = this.f10510b.getString(R.string.gwe);
        }
        this.f10511c.mo11515b();
        C11226ao.m19883a(this.f10510b, string, 0);
    }

    @Override // com.bytedance.android.live.broadcast.api.p187e.AbstractC3063c
    /* renamed from: a */
    public final void mo8327a(C9688bt btVar) {
        if (this.f10515k <= 0) {
            Spannable a = C7557c.m15538a(btVar.f23581h, btVar.f23581h.f23646b);
            Spannable a2 = C7557c.m15538a(btVar.f23583j, btVar.f23583j.f23646b);
            DialogC9148b.C9149a aVar = new DialogC9148b.C9149a(this.f10510b);
            aVar.f22244a = a;
            aVar.f22246c = a2;
            DialogC9148b.C9149a b = aVar.mo15245a((CharSequence) this.f10510b.getString(R.string.gib), this.f10516l, false).mo15250b((CharSequence) this.f10510b.getString(R.string.gmb), this.f10517m, false);
            b.f22256m = false;
            b.mo15247a().show();
            this.f10515k++;
            C6501b.C6502a.m13948a("livesdk_change_cover_window_show").mo12652a((Map<String, String>) mo9132b()).mo12655b();
        } else if (Logger.debug()) {
            C3854a.m9453a(6, "LiveDefaultCoverController", "Reach the upper limit , do not show dialog");
        }
    }

    public C3788i(Fragment fragment, Room room) {
        this.f10513i = room;
        this.f10510b = fragment.getContext();
        this.f10515k = 0;
        this.f10509a = this.f10513i.getId();
        this.f10514j = this.f10513i.getOwnerUserId();
        this.f10511c = C11275l.m19979a(fragment.getActivity(), fragment, "cover", f10505e, f10506f, f10507g, f10508h, this);
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5773g.AbstractC5774a
    /* renamed from: a */
    public final void mo9128a(final String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            mo9131a(new FileNotFoundException("avatar file don't exists in path".concat(String.valueOf(str))));
            return;
        }
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("file", new TypedFile("multipart/form-data", file));
        C3719d.C3720a.m9229a().mo9040b().uploadAvatar(multipartTypedOutput).mo142910a(new C11191f()).mo116431a_(new AbstractC88406ae<C5832d<C2993a>>() {
            /* class com.bytedance.android.live.broadcast.widget.C3788i.C37891 */

            static {
                Covode.recordClassIndex(4315);
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onSubscribe(AbstractC88412b bVar) {
                C3788i.this.f10512d.mo142945a(bVar);
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onError(Throwable th) {
                C3788i.this.mo9131a(th);
                JSONObject jSONObject = new JSONObject();
                C3866a.m9475a(jSONObject, "error_code", "1");
                C3866a.m9475a(jSONObject, "error_msg", th.toString());
                C3868c.m9492a("ttlive_upload_cover_all", 1, jSONObject);
                C3868c.m9492a("ttlive_upload_cover_error", 1, jSONObject);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.AbstractC88406ae
            public final /* synthetic */ void onSuccess(C5832d<C2993a> dVar) {
                C5832d<C2993a> dVar2 = dVar;
                ((C2993a) dVar2.data).f8815c = str;
                C3788i iVar = C3788i.this;
                C6501b.C6502a.m13948a("livesdk_upload_cover_success").mo12652a((Map<String, String>) iVar.mo9132b()).mo12655b();
                iVar.f10511c.mo11515b();
                C11226ao.m19883a(iVar.f10510b, iVar.f10510b.getString(R.string.gqf), 0);
                C3719d.C3720a.m9229a().mo9038a().updateRoomInfo(iVar.f10509a, ((C2993a) dVar2.data).f8813a).mo143271a(new C11191f()).mo143062b(new AbstractC88986z<C5832d<C3273p>>() {
                    /* class com.bytedance.android.live.broadcast.widget.C3788i.C37902 */

                    static {
                        Covode.recordClassIndex(4316);
                    }

                    @Override // p4560f.p4561a.AbstractC88986z
                    public final void onComplete() {
                    }

                    @Override // p4560f.p4561a.AbstractC88986z
                    public final void onSubscribe(AbstractC88412b bVar) {
                        C3788i.this.f10512d.mo142945a(bVar);
                    }

                    @Override // p4560f.p4561a.AbstractC88986z
                    public final void onError(Throwable th) {
                        C3854a.m9453a(6, "LiveDefaultCoverController", th.toString());
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4560f.p4561a.AbstractC88986z
                    public final /* synthetic */ void onNext(C5832d<C3273p> dVar) {
                        C5832d<C3273p> dVar2 = dVar;
                        C3788i iVar = C3788i.this;
                        if (dVar2 != null) {
                            try {
                                if (dVar2.data == null || !((C3273p) dVar2.data).f9385a.booleanValue()) {
                                    C3854a.m9453a(6, "LiveDefaultCoverController", dVar2.toString());
                                    return;
                                }
                                if (Logger.debug()) {
                                    C3854a.m9453a(3, "LiveDefaultCoverController", "update room cover info");
                                }
                                C6501b.C6502a.m13948a("livesdk_cover_pass_audit").mo12652a((Map<String, String>) iVar.mo9132b()).mo12655b();
                            } catch (Exception e) {
                                C3854a.m9453a(6, "LiveDefaultCoverController", e.toString());
                            }
                        }
                    }
                });
                C3868c.m9492a("ttlive_upload_cover_all", 0, (JSONObject) null);
            }
        });
    }

    @Override // com.bytedance.android.live.broadcast.api.p187e.AbstractC3063c
    /* renamed from: a */
    public final void mo8326a(int i, int i2, Intent intent) {
        this.f10511c.mo11514a(i, i2, intent);
    }
}
