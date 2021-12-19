package com.p2082ss.android.ugc.aweme.commercialize.live.promote.p2596a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.android.live.slot.AbstractC6157ab;
import com.bytedance.android.live.slot.AbstractC6162ae;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commercialize.live.promote.api.PromoteEntryCheckApi;
import com.p2082ss.android.ugc.aweme.commercialize.live.promote.p2598c.C38140a;
import com.p2082ss.android.ugc.aweme.commercialize.util.C38583c;
import com.p2082ss.android.ugc.aweme.commercialize.util.p2620b.C38582a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.promote.a.c */
public final class C38126c extends AbstractC38122a<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.EnumC6149b> {

    /* renamed from: d */
    public static final C38127a f90087d = new C38127a((byte) 0);

    /* renamed from: c */
    public final Context f90088c;

    /* renamed from: e */
    private IIconSlot.SlotViewModel f90089e;

    /* renamed from: f */
    private final C38123b f90090f = new C38123b(new C38128b(this));

    /* renamed from: g */
    private AbstractC6157ab.AbstractC6158a f90091g;

    static {
        Covode.recordClassIndex(45596);
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: g */
    public final String mo12080g() {
        return "promote";
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.promote.a.c$a */
    public static final class C38127a {
        static {
            Covode.recordClassIndex(45597);
        }

        private C38127a() {
        }

        public /* synthetic */ C38127a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Enum mo12078e() {
        return IIconSlot.EnumC6149b.SLOT_BROADCAST_PREVIEW_PROMOTE;
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo12079f() {
        return this.f90090f;
    }

    public C38126c(Context context) {
        C89219l.m154721d(context, "");
        this.f90088c = context;
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: a */
    public final void mo12074a(Map<String, ? extends Object> map, AbstractC6157ab.AbstractC6159b bVar) {
        C89219l.m154721d(map, "");
        C89219l.m154721d(bVar, "");
        Object obj = map.get("param_broadcast_preview_promote_bool");
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        bVar.mo12045a(C89219l.m154714a(obj, (Object) true));
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.promote.a.c$b */
    static final class C38128b implements AbstractC6162ae {

        /* renamed from: a */
        final /* synthetic */ C38126c f90092a;

        static {
            Covode.recordClassIndex(45598);
        }

        C38128b(C38126c cVar) {
            this.f90092a = cVar;
        }

        @Override // com.bytedance.android.live.slot.AbstractC6162ae
        /* renamed from: a */
        public final void mo12082a(View view, String str) {
            if (!C58001a.m104815a(view, 1200)) {
                ((PromoteEntryCheckApi) C38582a.m78287a(PromoteEntryCheckApi.class, C38583c.f91178a)).getPromoteEntryCheck("", "before_live").mo143254a(new AbstractC88433f(this, "before_live") {
                    /* class com.p2082ss.android.ugc.aweme.commercialize.live.promote.p2596a.C38126c.C38128b.C381291 */

                    /* renamed from: a */
                    final /* synthetic */ C38128b f90093a;

                    static {
                        Covode.recordClassIndex(45599);
                    }

                    {
                        this.f90093a = r1;
                    }

                    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0064, code lost:
                        if (r10 != null) goto L_0x0066;
                     */
                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final /* synthetic */ void accept(java.lang.Object r10) {
                        /*
                        // Method dump skipped, instructions count: 239
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.live.promote.p2596a.C38126c.C38128b.C381291.accept(java.lang.Object):void");
                    }
                }, new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.commercialize.live.promote.p2596a.C38126c.C38128b.C381302 */

                    /* renamed from: a */
                    final /* synthetic */ C38128b f90095a;

                    static {
                        Covode.recordClassIndex(45600);
                    }

                    {
                        this.f90095a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        String str;
                        Resources resources;
                        Context context = this.f90095a.f90092a.f90088c;
                        if (context == null || (resources = context.getResources()) == null) {
                            str = null;
                        } else {
                            str = resources.getString(R.string.dck);
                        }
                        C11226ao.m19884a(str);
                    }
                });
                C39162r.m79460a("Promote_live_entrance_click", new C33744d().mo59983a("user_id", C38140a.m77274a()).mo59980a("promote_version", C38140a.m77276b()).mo59980a("user_account_type", C38140a.m77277c()).mo59983a("entrance_type", "go_live").f79943a);
            }
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: a */
    public final /* synthetic */ void mo12071a(AbstractC1174ac acVar, AbstractC6157ab.AbstractC6158a aVar) {
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) acVar;
        C89219l.m154721d(slotViewModel, "");
        C89219l.m154721d(aVar, "");
        this.f90089e = slotViewModel;
        this.f90091g = aVar;
        if (slotViewModel != null) {
            C89219l.m154721d(slotViewModel, "");
            C1213t<Boolean> tVar = slotViewModel.f15351b;
            C89219l.m154716b(tVar, "");
            Looper mainLooper = Looper.getMainLooper();
            C89219l.m154716b(mainLooper, "");
            if (mainLooper.getThread() == Thread.currentThread()) {
                tVar.setValue(true);
            } else {
                tVar.postValue(true);
            }
            C1213t<Drawable> tVar2 = slotViewModel.f15354e;
            C89219l.m154716b(tVar2, "");
            tVar2.setValue(C0643b.m2369a(this.f90088c, 2131232666));
            C1213t<String> tVar3 = slotViewModel.f15358i;
            C89219l.m154716b(tVar3, "");
            tVar3.setValue(this.f90088c.getString(R.string.ex6));
            C38140a.m77275a(this.f90088c);
        }
        C39162r.m79460a("Promote_live_entrance_show", new C33744d().mo59983a("user_id", C38140a.m77274a()).mo59980a("promote_version", C38140a.m77276b()).mo59980a("user_account_type", C38140a.m77277c()).mo59983a("entrance_type", "go_live").f79943a);
    }
}
