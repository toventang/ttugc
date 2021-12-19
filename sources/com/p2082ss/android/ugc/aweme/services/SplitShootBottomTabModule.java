package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.p2082ss.android.ugc.gamora.p4272a.C82004a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83467k;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.C83409d;
import com.p2082ss.android.ugc.gamora.recorder.p4305l.AbstractC83869f;
import com.p2082ss.android.ugc.gamora.recorder.p4306m.AbstractC83881a;
import com.p2082ss.android.ugc.gamora.recorder.permission.PermissionStateViewModel;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.services.SplitShootBottomTabModule */
public final class SplitShootBottomTabModule implements AbstractC21566a, AbstractC83405a {
    static final /* synthetic */ AbstractC89286i[] $$delegatedProperties = {new C89232y(SplitShootBottomTabModule.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0), new C89232y(SplitShootBottomTabModule.class, "speedApiComponent", "getSpeedApiComponent()Lcom/ss/android/ugc/gamora/recorder/speed/SpeedApiComponent;", 0), new C89232y(SplitShootBottomTabModule.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0)};
    private AbstractC14177d cameraApiComponent;
    private final boolean defaultSelected;
    private final C21582f diContainer;
    public PermissionStateViewModel permissionStateViewModel;
    private final AbstractC89248d recordControlApi$delegate = C21572a.m40504a(getDiContainer(), AbstractC14193m.class);
    private final AbstractC89248d speedApiComponent$delegate = C21572a.m40505b(getDiContainer(), AbstractC83869f.class);
    private final AbstractC89248d splitShootApiComponent$delegate = C21572a.m40505b(getDiContainer(), AbstractC83881a.class);
    private final String tag;
    private final String text;

    static {
        Covode.recordClassIndex(79730);
    }

    public final AbstractC14193m getRecordControlApi() {
        return (AbstractC14193m) this.recordControlApi$delegate.mo23374a(this, $$delegatedProperties[2]);
    }

    public final AbstractC83869f getSpeedApiComponent() {
        return (AbstractC83869f) this.speedApiComponent$delegate.mo23374a(this, $$delegatedProperties[1]);
    }

    public final AbstractC83881a getSplitShootApiComponent() {
        return (AbstractC83881a) this.splitShootApiComponent$delegate.mo23374a(this, $$delegatedProperties[0]);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a
    public final AbstractC83467k provideScene() {
        return null;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.diContainer;
    }

    public static final /* synthetic */ PermissionStateViewModel access$getPermissionStateViewModel$p(SplitShootBottomTabModule splitShootBottomTabModule) {
        PermissionStateViewModel permissionStateViewModel2 = splitShootBottomTabModule.permissionStateViewModel;
        if (permissionStateViewModel2 == null) {
            C89219l.m154710a("permissionStateViewModel");
        }
        return permissionStateViewModel2;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a
    public final C83409d createBottomTabItem(C82004a aVar) {
        C89219l.m154721d(aVar, "");
        return new C83409d(this.text, this.tag, "video_15", this.defaultSelected, new SplitShootBottomTabModule$createBottomTabItem$1(this, aVar));
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a
    public final void initialize(C82004a aVar) {
        C89219l.m154721d(aVar, "");
        this.cameraApiComponent = aVar.mo127183d();
        JediViewModel a = C20531t.m38716a(aVar.mo127169a()).mo33800a(PermissionStateViewModel.class);
        C89219l.m154716b(a, "");
        this.permissionStateViewModel = (PermissionStateViewModel) a;
    }

    public SplitShootBottomTabModule(String str, String str2, C21582f fVar, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(fVar, "");
        this.text = str;
        this.tag = str2;
        this.diContainer = fVar;
        this.defaultSelected = z;
    }
}
