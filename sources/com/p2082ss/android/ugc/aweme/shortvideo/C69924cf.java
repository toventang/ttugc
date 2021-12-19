package com.p2082ss.android.ugc.aweme.shortvideo;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.property.C65405cq;
import com.p2082ss.android.ugc.aweme.shortvideo.C70006cs;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73756j;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.PermissionSettingItem;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cf */
public final class C69924cf {

    /* renamed from: a */
    public Fragment f156257a;

    /* renamed from: b */
    public PermissionSettingItem f156258b;

    /* renamed from: c */
    int f156259c;

    /* renamed from: d */
    public AbstractC89171a<C89391z> f156260d;

    /* renamed from: e */
    public C70006cs.C70008b f156261e;

    /* renamed from: f */
    public AbstractC69923ce f156262f;

    /* renamed from: g */
    public AbstractC73756j f156263g;

    /* renamed from: h */
    public VideoPublishEditModel f156264h;

    static {
        Covode.recordClassIndex(82333);
    }

    /* renamed from: a */
    public static void m123487a(Bundle bundle) {
        if (bundle != null) {
            bundle.putInt("permission", C65405cq.m117106a() ? 1 : 0);
        }
    }

    public C69924cf(Fragment fragment, PermissionSettingItem permissionSettingItem, int i) {
        this.f156257a = fragment;
        this.f156258b = permissionSettingItem;
        this.f156259c = i;
    }

    /* renamed from: a */
    public final void mo110334a(AbstractC69923ce ceVar, AbstractC73756j jVar, boolean z, boolean z2) {
        this.f156261e.f156501a = this.f156259c;
        VideoPublishEditModel videoPublishEditModel = this.f156264h;
        if (videoPublishEditModel != null) {
            this.f156261e.f156502b = videoPublishEditModel.mStickerID;
        }
        this.f156261e.f156503c = this.f156258b.getPermission();
        this.f156261e.f156504d = this.f156258b.f164650a;
        this.f156261e.f156505e = this.f156258b.getPreventSelfSeeReason();
        this.f156261e.f156506f = R.string.bxl;
        this.f156261e.f156507g = R.string.bxk;
        this.f156261e.f156508h = ceVar.mo69182a();
        this.f156261e.f156509i = ceVar.mo69183b();
        this.f156261e.f156510j = ceVar.mo69184c();
        this.f156261e.f156511k = ceVar.mo69185d();
        this.f156261e.f156512l = ceVar.mo69186e();
        this.f156261e.f156513m = this.f156258b.f164651b;
        this.f156261e.f156514n = this.f156258b.getMissionStatus();
        this.f156261e.f156515o = this.f156258b.getMissionId();
        this.f156261e.f156516p = jVar;
        this.f156261e.f156517q = this.f156264h;
        this.f156261e.f156518r = this.f156260d;
        this.f156261e.f156519s = z;
        this.f156261e.f156520t = z2;
    }

    /* renamed from: a */
    public final void mo110332a(int i, List<User> list, int i2, boolean z, String str) {
        this.f156258b.mo115831a(i, list, i2, z, str);
    }

    /* renamed from: a */
    public final void mo110333a(AbstractC69923ce ceVar, AbstractC73756j jVar, DialogInterface.OnDismissListener onDismissListener, boolean z, boolean z2) {
        this.f156261e = new C70006cs.C70008b();
        this.f156262f = ceVar;
        this.f156263g = jVar;
        this.f156258b.mo115832a(new View$OnClickListenerC69925cg(this, ceVar, jVar, z, z2, onDismissListener));
        if (!C65405cq.m117106a()) {
            this.f156258b.setVisibility(8);
        }
    }
}
