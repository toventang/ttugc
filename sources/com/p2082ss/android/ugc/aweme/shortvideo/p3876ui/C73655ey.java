package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import androidx.lifecycle.AbstractC1214u;
import com.C1764a;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.p2082ss.android.ugc.aweme.photo.p3546a.C62855a;
import com.p2082ss.android.ugc.aweme.services.IAVMixFeedServiceImpl;
import com.p2082ss.android.ugc.aweme.services.publish.ExtensionDataRepo;
import com.p2082ss.android.ugc.aweme.services.publish.IPermissionAction;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ey */
public final /* synthetic */ class C73655ey implements AbstractC1214u {

    /* renamed from: a */
    private final C73560cj f165485a;

    /* renamed from: b */
    private final ExtensionDataRepo f165486b;

    static {
        Covode.recordClassIndex(86393);
    }

    C73655ey(C73560cj cjVar, ExtensionDataRepo extensionDataRepo) {
        this.f165485a = cjVar;
        this.f165486b = extensionDataRepo;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C73560cj cjVar = this.f165485a;
        ExtensionDataRepo extensionDataRepo = this.f165486b;
        C62855a aVar = (C62855a) obj;
        if (aVar != null) {
            int permission = aVar.getPermission();
            if (extensionDataRepo.getUpdateAnchor().getValue() != null) {
                extensionDataRepo.setIPermissionAction(new IPermissionAction(permission, extensionDataRepo, aVar) {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73560cj.C735769 */

                    /* renamed from: a */
                    final /* synthetic */ int f165378a;

                    /* renamed from: b */
                    final /* synthetic */ ExtensionDataRepo f165379b;

                    /* renamed from: c */
                    final /* synthetic */ C62855a f165380c;

                    static {
                        Covode.recordClassIndex(86313);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.services.publish.IPermissionAction
                    public final void cancel() {
                        C73560cj.this.f165338m.setValue(new C62855a(C73560cj.this.f165339n.f156258b.getPermission(), this.f165380c.getExcludeUserList(), C73560cj.this.f165339n.f156258b.getAllowRecommend()));
                    }

                    @Override // com.p2082ss.android.ugc.aweme.services.publish.IPermissionAction
                    public final void confirm() {
                        if (this.f165378a != 1) {
                            this.f165379b.getI18nPrivacy().setValue(true);
                        } else {
                            this.f165379b.getI18nPrivacy().setValue(false);
                            this.f165379b.getUpdateAnchor().setValue(null);
                        }
                        C73560cj.this.f165339n.mo110332a(this.f165378a, this.f165380c.getExcludeUserList(), 0, C73560cj.this.f165282Y, "");
                    }

                    {
                        this.f165378a = r2;
                        this.f165379b = r3;
                        this.f165380c = r4;
                    }
                });
                if (extensionDataRepo.getShowPermissionAction() != null && !extensionDataRepo.getShowPermissionAction().invoke(Integer.valueOf(permission)).booleanValue()) {
                    if (permission != 1) {
                        extensionDataRepo.getI18nPrivacy().setValue(true);
                    } else {
                        extensionDataRepo.getI18nPrivacy().setValue(false);
                    }
                    cjVar.f165339n.mo110332a(permission, aVar.getExcludeUserList(), 0, cjVar.f165282Y, "");
                }
            } else {
                if (permission != 1) {
                    extensionDataRepo.getI18nPrivacy().setValue(true);
                } else {
                    extensionDataRepo.getI18nPrivacy().setValue(false);
                }
                cjVar.f165339n.mo110332a(permission, aVar.getExcludeUserList(), aVar.getAllowRecommend(), cjVar.f165282Y, "");
            }
            if (cjVar.f165334i != null) {
                aVar.getExcludeUserList();
            }
            if (IAVMixFeedServiceImpl.createIAVMixFeedServicebyMonsterPlugin(false).needShowAddOrRemoveButton()) {
                if (permission != 0) {
                    cjVar.f165330e._alpha.setValue(Float.valueOf(0.3f));
                    cjVar.f165335j = false;
                    cjVar.f165337l = "";
                    cjVar.f165336k = "";
                    cjVar.f165330e._nameText.setValue("");
                } else {
                    cjVar.f165330e._alpha.setValue(Float.valueOf(1.0f));
                    cjVar.f165335j = true;
                }
            }
            if (!C13603b.m24435a((Collection) cjVar.f165268K.tagUserList)) {
                ArrayList arrayList = new ArrayList();
                if (permission == 1) {
                    Iterator<InteractionTagUserInfo> it = cjVar.f165268K.tagUserList.iterator();
                    while (it.hasNext()) {
                        InteractionTagUserInfo next = it.next();
                        arrayList.add(cjVar.f165308af ? next.getNickname() : next.getUniqueId());
                    }
                    cjVar.f165268K.tagUserList.clear();
                } else if (permission == 2) {
                    Iterator<InteractionTagUserInfo> it2 = cjVar.f165268K.tagUserList.iterator();
                    while (it2.hasNext()) {
                        InteractionTagUserInfo next2 = it2.next();
                        if (next2.getFollowStatus() != 2) {
                            arrayList.add(cjVar.f165308af ? next2.getNickname() : next2.getUniqueId());
                            it2.remove();
                        }
                    }
                }
                if (!C13603b.m24435a((Collection) arrayList) && arrayList.toString().length() >= 2) {
                    String obj2 = arrayList.toString();
                    new C23144b(cjVar).mo37635a(C1764a.m5928a(cjVar.getString(R.string.g_a), new Object[]{obj2.substring(1, obj2.length() - 1)})).mo37637b();
                }
                cjVar.mo116157g();
            }
        }
    }
}
