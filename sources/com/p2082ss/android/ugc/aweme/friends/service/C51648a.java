package com.p2082ss.android.ugc.aweme.friends.service;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.experiment.C46927fd;
import com.p2082ss.android.ugc.aweme.friends.AbstractC51479c;
import com.p2082ss.android.ugc.aweme.friends.AbstractC51485d;
import com.p2082ss.android.ugc.aweme.friends.AbstractC51499g;
import com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51538a;
import com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51539b;
import com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51540c;
import com.p2082ss.android.ugc.aweme.friends.model.Friend;
import com.p2082ss.android.ugc.aweme.friends.model.FriendList;
import com.p2082ss.android.ugc.aweme.friends.model.UploadContactsResult;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51735f;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51754w;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51755x;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51756y;
import com.p2082ss.android.ugc.aweme.friends.service.IFriendsService;
import com.p2082ss.android.ugc.aweme.friends.widget.contact.AbstractC51779c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.relation.CheckMatchedFriendsResponse;
import com.p2082ss.android.ugc.aweme.ufr.AbstractC79495a;
import java.util.HashMap;
import java.util.List;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.service.a */
public final class C51648a implements IFriendsService {

    /* renamed from: a */
    public static final C51648a f118980a = new C51648a();

    /* renamed from: c */
    private final /* synthetic */ IFriendsService f118981c;

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final int mo87293a(String str) {
        C89219l.m154721d(str, "");
        return this.f118981c.mo87293a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final Intent mo87294a(Context context, int i, int i2, String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return this.f118981c.mo87294a(context, i, i2, str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final C46927fd mo87295a(int i) {
        return this.f118981c.mo87295a(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final AbstractC51539b mo87296a(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        return this.f118981c.mo87296a(eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final AbstractC51540c mo87297a(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        return this.f118981c.mo87297a(fragment);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final AbstractC51755x mo87298a(Context context) {
        C89219l.m154721d(context, "");
        return this.f118981c.mo87298a(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final AbstractC51756y mo87299a(Context context, HashMap<String, Boolean> hashMap, boolean z, boolean z2) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(hashMap, "");
        return this.f118981c.mo87299a(context, hashMap, z, z2);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final AbstractC88403ab<CheckMatchedFriendsResponse> mo87300a() {
        return this.f118981c.mo87300a();
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final AbstractC88979t<FriendList<Friend>> mo87301a(String str, int i) {
        C89219l.m154721d(str, "");
        return this.f118981c.mo87301a(str, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final C89378p<String, HashMap<String, Object>> mo87302a(String str, C89378p<String, ? extends HashMap<String, Object>> pVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(pVar, "");
        return this.f118981c.mo87302a(str, pVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final void mo87303a(int i, String str, ActivityC0945e eVar) {
        C89219l.m154721d(str, "");
        this.f118981c.mo87303a(i, str, eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final void mo87304a(int i, String str, String str2, Context context) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(context, "");
        this.f118981c.mo87304a(i, str, str2, context);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final void mo87305a(Activity activity, AbstractC51735f fVar) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(fVar, "");
        this.f118981c.mo87305a(activity, fVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final void mo87306a(C46927fd fdVar, String str, String str2, Context context) {
        C89219l.m154721d(fdVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(context, "");
        this.f118981c.mo87306a(fdVar, str, str2, context);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final void mo87307a(AbstractC51499g gVar) {
        C89219l.m154721d(gVar, "");
        this.f118981c.mo87307a(gVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final void mo87308a(String str, boolean z) {
        C89219l.m154721d(str, "");
        this.f118981c.mo87308a(str, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final boolean mo87309a(Activity activity) {
        C89219l.m154721d(activity, "");
        return this.f118981c.mo87309a(activity);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final boolean mo87310a(User user) {
        return this.f118981c.mo87310a(user);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final boolean mo87311a(boolean z) {
        return this.f118981c.mo87311a(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: b */
    public final AbstractC51538a mo87312b(Context context) {
        C89219l.m154721d(context, "");
        return this.f118981c.mo87312b(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: b */
    public final IContactService mo87313b() {
        return this.f118981c.mo87313b();
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: b */
    public final AbstractC88979t<UploadContactsResult> mo87314b(int i) {
        return this.f118981c.mo87314b(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: b */
    public final void mo87315b(AbstractC51499g gVar) {
        C89219l.m154721d(gVar, "");
        this.f118981c.mo87315b(gVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: b */
    public final void mo87316b(String str) {
        C89219l.m154721d(str, "");
        this.f118981c.mo87316b(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: b */
    public final void mo87317b(boolean z) {
        this.f118981c.mo87317b(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: b */
    public final boolean mo87318b(Activity activity) {
        return this.f118981c.mo87318b(activity);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: c */
    public final AbstractC88979t<List<Friend>> mo87319c(int i) {
        return this.f118981c.mo87319c(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: c */
    public final Class<? extends AbstractC79495a> mo87320c() {
        return this.f118981c.mo87320c();
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: c */
    public final void mo87321c(boolean z) {
        this.f118981c.mo87321c(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: d */
    public final AbstractC51479c mo87322d() {
        return this.f118981c.mo87322d();
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: d */
    public final void mo87323d(int i) {
        this.f118981c.mo87323d(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: d */
    public final void mo87324d(boolean z) {
        this.f118981c.mo87324d(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: e */
    public final boolean mo87325e() {
        return this.f118981c.mo87325e();
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: f */
    public final Class<? extends AbstractC79495a> mo87326f() {
        return this.f118981c.mo87326f();
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: g */
    public final AbstractC51485d mo87327g() {
        return this.f118981c.mo87327g();
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: h */
    public final long mo87328h() {
        return this.f118981c.mo87328h();
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: i */
    public final AbstractC51754w mo87329i() {
        return this.f118981c.mo87329i();
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: j */
    public final IFriendsService.AbstractC51638b mo87330j() {
        return this.f118981c.mo87330j();
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: k */
    public final IFriendsService.AbstractC51640d mo87331k() {
        return this.f118981c.mo87331k();
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: l */
    public final boolean mo87332l() {
        return this.f118981c.mo87332l();
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: m */
    public final boolean mo87333m() {
        return this.f118981c.mo87333m();
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: n */
    public final boolean mo87334n() {
        return this.f118981c.mo87334n();
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: o */
    public final int mo87335o() {
        return this.f118981c.mo87335o();
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: p */
    public final AbstractC51779c mo87336p() {
        return this.f118981c.mo87336p();
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: q */
    public final void mo87337q() {
        this.f118981c.mo87337q();
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: r */
    public final boolean mo87338r() {
        return this.f118981c.mo87338r();
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: s */
    public final AbstractC51649b mo87339s() {
        return this.f118981c.mo87339s();
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: t */
    public final void mo87340t() {
        this.f118981c.mo87340t();
    }

    static {
        Covode.recordClassIndex(60999);
    }

    private C51648a() {
        IFriendsService u = FriendsServiceImpl.m96115u();
        C89219l.m154716b(u, "");
        this.f118981c = u;
    }
}
