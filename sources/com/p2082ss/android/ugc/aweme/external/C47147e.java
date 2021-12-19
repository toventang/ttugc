package com.p2082ss.android.ugc.aweme.external;

import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.detail.api.CheckDuetReactPermissionApi;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.C43225d;
import com.p2082ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.AVSettingsServiceImpl;
import com.p2082ss.android.ugc.aweme.services.GeoFencingServiceImpl;
import com.p2082ss.android.ugc.aweme.services.IShortVideoConfig;
import com.p2082ss.android.ugc.aweme.services.config.ShortVideoConfigImpl;
import com.p2082ss.android.ugc.aweme.services.effect.EffectService;
import com.p2082ss.android.ugc.aweme.services.external.ICacheService;
import com.p2082ss.android.ugc.aweme.services.external.IConfigService;
import com.p2082ss.android.ugc.aweme.services.external.IGeofencingService;
import com.p2082ss.android.ugc.aweme.services.external.IPrivacyConfig;
import com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.p2082ss.android.ugc.aweme.services.storage.StorageServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC69907ca;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC69923ce;
import com.p2082ss.android.ugc.aweme.shortvideo.C69924cf;
import com.p2082ss.android.ugc.aweme.shortvideo.C70637di;
import com.p2082ss.android.ugc.aweme.shortvideo.duet.C70661b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3838k.C71917k;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73756j;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.PermissionSettingItem;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75462e;
import com.p2082ss.android.ugc.aweme.sticker.types.lock.C76090e;
import com.p2082ss.android.ugc.aweme.tools.draft.p4112j.C78397c;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4140e.C78948b;
import com.p2082ss.android.ugc.aweme.tools.policysecurity.C79023a;
import com.p2082ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadTask;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.effectplatform.util.C87007u;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.external.e */
public final class C47147e implements IConfigService {

    /* renamed from: a */
    public static final AbstractC89244h f109770a = C89250i.m154773a((AbstractC89171a) C47149b.f109773a);

    /* renamed from: b */
    public static final C47148a f109771b = new C47148a((byte) 0);

    /* renamed from: c */
    private final AbstractC89244h f109772c = C89250i.m154773a((AbstractC89171a) new C47150c(this));

    /* renamed from: com.ss.android.ugc.aweme.external.e$d */
    public static final class C47158d implements IPrivacyConfig {
        static {
            Covode.recordClassIndex(55762);
        }

        /* renamed from: com.ss.android.ugc.aweme.external.e$d$a */
        public static final class C47159a implements IPrivacyConfig.IPermissionModule {

            /* renamed from: a */
            final /* synthetic */ C69924cf f109782a;

            /* renamed from: b */
            final /* synthetic */ boolean f109783b;

            static {
                Covode.recordClassIndex(55763);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionModule
            public final void setOnPermissionSetListener(AbstractC69907ca caVar) {
                C89219l.m154721d(caVar, "");
            }

            @Override // com.p2082ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionModule
            public final boolean isEnablePublishExclusionExperiment() {
                return C71917k.f161153a;
            }

            /* renamed from: com.ss.android.ugc.aweme.external.e$d$a$a */
            public static final class C47160a implements AbstractC73756j {

                /* renamed from: a */
                final /* synthetic */ IPrivacyConfig.IPermissionPostCallback f109784a;

                static {
                    Covode.recordClassIndex(55764);
                }

                C47160a(IPrivacyConfig.IPermissionPostCallback iPermissionPostCallback) {
                    this.f109784a = iPermissionPostCallback;
                }

                @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73756j
                /* renamed from: a */
                public final void mo79539a(int i) {
                    this.f109784a.doPostData(i);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionModule
            public final void onSaveInstanceState(Bundle bundle) {
                C89219l.m154721d(bundle, "");
                C69924cf.m123487a(bundle);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionModule
            public final void receivePermissionResult(int i) {
                this.f109782a.f156258b.mo115830a(i, null, 0);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionModule
            public final void restoreSavedInstanceState(Bundle bundle) {
                C89219l.m154721d(bundle, "");
                C69924cf cfVar = this.f109782a;
                int i = bundle.getInt("allowRecommend");
                cfVar.f156258b.mo115830a(bundle.getInt("permission"), (List) bundle.getSerializable("excludeUserList"), i);
            }

            C47159a(C69924cf cfVar, boolean z) {
                this.f109782a = cfVar;
                this.f109783b = z;
            }

            @Override // com.p2082ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionModule
            public final void setupV2(AbstractC69923ce ceVar, IPrivacyConfig.IPermissionPostCallback iPermissionPostCallback) {
                C89219l.m154721d(ceVar, "");
                C89219l.m154721d(iPermissionPostCallback, "");
                this.f109782a.mo110333a(ceVar, (AbstractC73756j) new C47160a(iPermissionPostCallback), (DialogInterface.OnDismissListener) null, this.f109783b, true);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.external.e$d$b */
        public static final class C47161b implements IPrivacyConfig.IPermissionSettingItem {

            /* renamed from: a */
            final /* synthetic */ PermissionSettingItem f109785a;

            static {
                Covode.recordClassIndex(55765);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionSettingItem
            public final View asView() {
                return this.f109785a;
            }

            @Override // com.p2082ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionSettingItem
            public final TextView getPrivateHint() {
                View findViewById = this.f109785a.findViewById(R.id.d6q);
                C89219l.m154716b(findViewById, "");
                return (TextView) findViewById;
            }

            @Override // com.p2082ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionSettingItem
            public final ImageView getPrivateIcon() {
                View findViewById = this.f109785a.findViewById(R.id.d6s);
                C89219l.m154716b(findViewById, "");
                return (ImageView) findViewById;
            }

            C47161b(PermissionSettingItem permissionSettingItem) {
                this.f109785a = permissionSettingItem;
            }

            @Override // com.p2082ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionSettingItem
            public final void setAdvPromotable(boolean z) {
                this.f109785a.setAdvPromotable(z);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionSettingItem
            public final void setAllowRecommend(int i) {
                this.f109785a.setAllowRecommend(i);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionSettingItem
            public final void setFromChangePrivacy(boolean z) {
                this.f109785a.setFromChangePrivacy(z);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionSettingItem
            public final void setMission(int i, String str) {
                C89219l.m154721d(str, "");
                this.f109785a.setMissionStatus(i);
                this.f109785a.setMissionId(str);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionSettingItem
            public final void setPermission(int i, List<? extends User> list, int i2) {
                this.f109785a.mo115830a(i, list, i2);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionSettingItem
            public final void setPermission(int i, boolean z, String str) {
                C89219l.m154721d(str, "");
                this.f109785a.mo115831a(i, null, 0, z, str);
            }
        }

        C47158d() {
        }

        @Override // com.p2082ss.android.ugc.aweme.services.external.IPrivacyConfig
        public final IPrivacyConfig.IPermissionSettingItem createPermissionSettingItem(Context context) {
            C89219l.m154721d(context, "");
            return new C47161b(new PermissionSettingItem(context, null));
        }

        @Override // com.p2082ss.android.ugc.aweme.services.external.IPrivacyConfig
        public final C70661b checkDuetReactPermission(String str, int i) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str, "");
            T t = ((CheckDuetReactPermissionApi.CheckDuetReactPermissionRequest) C63244g.m114602a().mo73257C().createRetrofit(CheckDuetReactPermissionApi.f96098a, true, CheckDuetReactPermissionApi.CheckDuetReactPermissionRequest.class)).checkDuetReactPermission(str, i).execute().f52262b;
            C89219l.m154716b(t, "");
            return t;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.external.IPrivacyConfig
        public final IPrivacyConfig.IPermissionModule createPermissionModule(Fragment fragment, IPrivacyConfig.IPermissionSettingItem iPermissionSettingItem, int i, boolean z) {
            C89219l.m154721d(fragment, "");
            C89219l.m154721d(iPermissionSettingItem, "");
            View asView = iPermissionSettingItem.asView();
            Objects.requireNonNull(asView, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.PermissionSettingItem");
            return new C47159a(new C69924cf(fragment, (PermissionSettingItem) asView, i), z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.e$a */
    public static final class C47148a {
        static {
            Covode.recordClassIndex(55752);
        }

        private C47148a() {
        }

        public /* synthetic */ C47148a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IConfigService
    public final IGeofencingService geoFencingConfig() {
        return GeoFencingServiceImpl.INSTANCE;
    }

    /* renamed from: com.ss.android.ugc.aweme.external.e$b */
    static final class C47149b extends AbstractC89220m implements AbstractC89171a<C47147e> {

        /* renamed from: a */
        public static final C47149b f109773a = new C47149b();

        static {
            Covode.recordClassIndex(55753);
        }

        C47149b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C47147e invoke() {
            return new C47147e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.e$c */
    static final class C47150c extends AbstractC89220m implements AbstractC89171a<C471511> {

        /* renamed from: a */
        final /* synthetic */ C47147e f109774a;

        static {
            Covode.recordClassIndex(55754);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47150c(C47147e eVar) {
            super(0);
            this.f109774a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C471511 invoke() {
            return new ICacheService(this) {
                /* class com.p2082ss.android.ugc.aweme.external.C47147e.C47150c.C471511 */

                /* renamed from: a */
                final /* synthetic */ C47150c f109775a;

                static {
                    Covode.recordClassIndex(55755);
                }

                @Override // com.p2082ss.android.ugc.aweme.services.external.ICacheService
                public final String cacheDir() {
                    String str = C70637di.f158112o;
                    C89219l.m154716b(str, "");
                    return str;
                }

                @Override // com.p2082ss.android.ugc.aweme.services.external.ICacheService
                public final String compatMusDraftDir() {
                    String str = C70637di.f158118u;
                    C89219l.m154716b(str, "");
                    return str;
                }

                @Override // com.p2082ss.android.ugc.aweme.services.external.ICacheService
                public final String filterDir() {
                    String str = C70637di.f158113p;
                    C89219l.m154716b(str, "");
                    return str;
                }

                @Override // com.p2082ss.android.ugc.aweme.services.external.ICacheService
                public final String musicDir() {
                    String str = C70637di.f158115r;
                    C89219l.m154716b(str, "");
                    return str;
                }

                @Override // com.p2082ss.android.ugc.aweme.services.external.ICacheService
                public final String rootDir() {
                    String str = C70637di.f158101d;
                    C89219l.m154716b(str, "");
                    return str;
                }

                @Override // com.p2082ss.android.ugc.aweme.services.external.ICacheService
                public final String stickerDir() {
                    String str = C70637di.f158098a;
                    C89219l.m154716b(str, "");
                    return str;
                }

                @Override // com.p2082ss.android.ugc.aweme.services.external.ICacheService
                public final Collection<String> allowList() {
                    return new StorageServiceImpl().getPrefixAllowList();
                }

                @Override // com.p2082ss.android.ugc.aweme.services.external.ICacheService
                public final void clearMvCache() {
                    C63238c.f143566D.mo73308d().mo101651a().mo101663d();
                }

                @Override // com.p2082ss.android.ugc.aweme.services.external.ICacheService
                public final ArrayList<String> draftEffectList() {
                    ArrayList<String> e = EffectPlatform.m89512e();
                    C89219l.m154716b(e, "");
                    return e;
                }

                @Override // com.p2082ss.android.ugc.aweme.services.external.ICacheService
                public final String effectCacheDir() {
                    String absolutePath = EffectPlatform.f108127a.getAbsolutePath();
                    C89219l.m154716b(absolutePath, "");
                    return absolutePath;
                }

                @Override // com.p2082ss.android.ugc.aweme.services.external.ICacheService
                public final String mvRootDir() {
                    String b = C78948b.m137767b();
                    C89219l.m154716b(b, "");
                    return b;
                }

                @Override // com.p2082ss.android.ugc.aweme.services.external.ICacheService
                public final Collection<String> tempVideoFile() {
                    HashSet hashSet = new HashSet();
                    new File(C70637di.f158102e).getAbsolutePath();
                    return hashSet;
                }

                @Override // com.p2082ss.android.ugc.aweme.services.external.ICacheService
                public final void clearFilterCache() {
                    C63238c.f143565C.mo73290r().mo86006d().mo86067b();
                    C63238c.f143565C.mo73290r().mo86009g();
                    C63238c.f143565C.mo73286n().mo120437a();
                }

                @Override // com.p2082ss.android.ugc.aweme.services.external.ICacheService
                public final ArrayList<String> draftMusicList() {
                    ArrayList<String> arrayList;
                    if (EffectPlatform.f108130d != null) {
                        arrayList = EffectPlatform.f108130d;
                    } else {
                        EffectPlatform.m89513f();
                        if (EffectPlatform.f108130d != null) {
                            arrayList = EffectPlatform.f108130d;
                        } else {
                            arrayList = new ArrayList<>();
                        }
                    }
                    C89219l.m154716b(arrayList, "");
                    return arrayList;
                }

                @Override // com.p2082ss.android.ugc.aweme.services.external.ICacheService
                public final File[] outputFile() {
                    File[] listFiles = new File(cacheDir()).listFiles(C47152a.f109776a);
                    C89219l.m154716b(listFiles, "");
                    return listFiles;
                }

                @Override // com.p2082ss.android.ugc.aweme.services.external.ICacheService
                public final File[] rawDuetFile() {
                    File[] listFiles = new File(C70637di.f158112o).listFiles(C47153b.f109777a);
                    C89219l.m154716b(listFiles, "");
                    return listFiles;
                }

                @Override // com.p2082ss.android.ugc.aweme.services.external.ICacheService
                public final File[] rawVideoFile() {
                    File[] listFiles = new File(C70637di.f158112o).listFiles(C47154c.f109778a);
                    C89219l.m154716b(listFiles, "");
                    return listFiles;
                }

                @Override // com.p2082ss.android.ugc.aweme.services.external.ICacheService
                public final String shareDir() {
                    return C70637di.f158101d + "share/";
                }

                @Override // com.p2082ss.android.ugc.aweme.services.external.ICacheService
                public final File[] synthesisFile() {
                    File[] listFiles = new File(C70637di.f158112o).listFiles(C47155d.f109779a);
                    C89219l.m154716b(listFiles, "");
                    return listFiles;
                }

                @Override // com.p2082ss.android.ugc.aweme.services.external.ICacheService
                public final File[] tempDuetFile() {
                    File[] listFiles = new File(C70637di.f158112o).listFiles(C47156e.f109780a);
                    C89219l.m154716b(listFiles, "");
                    return listFiles;
                }

                @Override // com.p2082ss.android.ugc.aweme.services.external.ICacheService
                public final File[] voiceFile() {
                    File[] listFiles = new File(cacheDir()).listFiles(C47157f.f109781a);
                    C89219l.m154716b(listFiles, "");
                    return listFiles;
                }

                @Override // com.p2082ss.android.ugc.aweme.services.external.ICacheService
                public final void clearDraftEffectCache() {
                    try {
                        EffectService instance = EffectService.getInstance();
                        C89219l.m154716b(instance, "");
                        String cacheDir = instance.getCacheDir();
                        EffectService instance2 = EffectService.getInstance();
                        C89219l.m154716b(instance2, "");
                        ArrayList<String> draftEffectList = instance2.getDraftEffectList();
                        C47147e eVar = this.f109775a.f109774a;
                        File file = new File(cacheDir);
                        C89219l.m154716b(draftEffectList, "");
                        eVar.mo79490a(file, draftEffectList);
                    } catch (Exception unused) {
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.services.external.ICacheService
                public final void clearEffectCache() {
                    C75462e.m132330a().clear();
                    C47147e eVar = this.f109775a.f109774a;
                    EffectService instance = EffectService.getInstance();
                    C89219l.m154716b(instance, "");
                    eVar.mo79491a(instance.getCacheDir());
                    C47147e eVar2 = this.f109775a.f109774a;
                    EffectService instance2 = EffectService.getInstance();
                    C89219l.m154716b(instance2, "");
                    eVar2.mo79491a(instance2.getModelCacheDir());
                }

                @Override // com.p2082ss.android.ugc.aweme.services.external.ICacheService
                public final Collection<String> draftAllowList() {
                    HashSet hashSet = new HashSet();
                    for (C43223c cVar : new C78397c().queryAllDraftList(true)) {
                        if (cVar != null) {
                            hashSet.addAll(C43225d.m86336f(cVar));
                        }
                    }
                    return hashSet;
                }

                @Override // com.p2082ss.android.ugc.aweme.services.external.ICacheService
                public final Collection<String> originSoundFile() {
                    Application application = C63238c.f143574a;
                    C89219l.m154716b(application, "");
                    ArrayList<OriginalSoundUploadTask> a = C79023a.C79024a.m137854a(application).mo122848a();
                    ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) a, 10));
                    Iterator<T> it = a.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().f177620c);
                    }
                    Object[] array = arrayList.toArray(new String[0]);
                    Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                    return C89064i.m154463a(array);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f109775a = r1;
                }

                /* renamed from: com.ss.android.ugc.aweme.external.e$c$1$a */
                static final class C47152a implements FileFilter {

                    /* renamed from: a */
                    public static final C47152a f109776a = new C47152a();

                    static {
                        Covode.recordClassIndex(55756);
                    }

                    C47152a() {
                    }

                    public final boolean accept(File file) {
                        if (!(file == null || !file.exists() || file.getName() == null)) {
                            String name = file.getName();
                            C89219l.m154716b(name, "");
                            if (C89361p.m154876c(name, "-mix-concat-a", false)) {
                                return true;
                            }
                        }
                        return false;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.external.e$c$1$b */
                static final class C47153b implements FileFilter {

                    /* renamed from: a */
                    public static final C47153b f109777a = new C47153b();

                    static {
                        Covode.recordClassIndex(55757);
                    }

                    C47153b() {
                    }

                    public final boolean accept(File file) {
                        if (!(file == null || !file.exists() || file.getName() == null)) {
                            String name = file.getName();
                            C89219l.m154716b(name, "");
                            if (!C89361p.m154874b(name, "temp_", false)) {
                                String name2 = file.getName();
                                C89219l.m154716b(name2, "");
                                if (C89361p.m154876c(name2, ".mp4", false)) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.external.e$c$1$c */
                static final class C47154c implements FileFilter {

                    /* renamed from: a */
                    public static final C47154c f109778a = new C47154c();

                    static {
                        Covode.recordClassIndex(55758);
                    }

                    C47154c() {
                    }

                    public final boolean accept(File file) {
                        if (!(file == null || !file.exists() || file.getName() == null)) {
                            String name = file.getName();
                            C89219l.m154716b(name, "");
                            if (C89361p.m154876c(name, "-concat-v", false)) {
                                String name2 = file.getName();
                                C89219l.m154716b(name2, "");
                                if (!C89361p.m154874b(name2, "synthetise_", false)) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.external.e$c$1$d */
                static final class C47155d implements FileFilter {

                    /* renamed from: a */
                    public static final C47155d f109779a = new C47155d();

                    static {
                        Covode.recordClassIndex(55759);
                    }

                    C47155d() {
                    }

                    public final boolean accept(File file) {
                        if (!(file == null || !file.exists() || file.getName() == null)) {
                            String name = file.getName();
                            C89219l.m154716b(name, "");
                            if (C89361p.m154874b(name, "synthetise_", false)) {
                                return true;
                            }
                            String name2 = file.getName();
                            C89219l.m154716b(name2, "");
                            if (C89361p.m154876c(name2, "_synthetise", false)) {
                                return true;
                            }
                        }
                        return false;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.external.e$c$1$e */
                static final class C47156e implements FileFilter {

                    /* renamed from: a */
                    public static final C47156e f109780a = new C47156e();

                    static {
                        Covode.recordClassIndex(55760);
                    }

                    C47156e() {
                    }

                    public final boolean accept(File file) {
                        if (!(file == null || !file.exists() || file.getName() == null)) {
                            String name = file.getName();
                            C89219l.m154716b(name, "");
                            if (C89361p.m154874b(name, "temp_", false)) {
                                return true;
                            }
                        }
                        return false;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.external.e$c$1$f */
                static final class C47157f implements FileFilter {

                    /* renamed from: a */
                    public static final C47157f f109781a = new C47157f();

                    static {
                        Covode.recordClassIndex(55761);
                    }

                    C47157f() {
                    }

                    public final boolean accept(File file) {
                        if (!(file == null || !file.exists() || file.getName() == null)) {
                            String name = file.getName();
                            C89219l.m154716b(name, "");
                            if (C89361p.m154876c(name, "-concat-a", false)) {
                                String name2 = file.getName();
                                C89219l.m154716b(name2, "");
                                if (!C89361p.m154876c(name2, "-mix-concat-a", false)) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                }
            };
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IConfigService
    public final IPrivacyConfig privacyConfig() {
        return new C47158d();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IConfigService
    public final IShortVideoConfig shortVideoConfig() {
        return ShortVideoConfigImpl.Companion.getInstance();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IConfigService
    public final IAVSettingsService avsettingsConfig() {
        AVSettingsServiceImpl instance = AVSettingsServiceImpl.getInstance();
        C89219l.m154716b(instance, "");
        return instance;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IConfigService
    public final ICacheService cacheConfig() {
        return (C47150c.C471511) this.f109772c.getValue();
    }

    static {
        Covode.recordClassIndex(55751);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IConfigService
    public final void updateServerSettings(IESSettingsProxy iESSettingsProxy) {
        AVSettingsServiceImpl.getInstance().updateServerSettings(iESSettingsProxy);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IConfigService
    public final void userAction(int i) {
        if (i == 2) {
            C76090e.f170958b = false;
            C76090e.f170957a.clear();
        }
    }

    /* renamed from: a */
    private static boolean m90341a(File file) {
        MethodCollector.m26663i(7309);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(7309);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(7309);
        return delete;
    }

    /* renamed from: a */
    public final void mo79491a(String str) {
        File[] listFiles;
        if (!C87007u.m150697a(str)) {
            File file = new File(str);
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    C89219l.m154716b(file2, "");
                    if (file2.isDirectory()) {
                        mo79491a(file2.getPath());
                    } else {
                        m90341a(file2);
                    }
                }
                m90341a(file);
            }
        }
    }

    /* renamed from: a */
    public final void mo79490a(File file, ArrayList<String> arrayList) {
        if (file.exists() && file.isDirectory()) {
            if (arrayList.isEmpty()) {
                mo79491a(file.getAbsolutePath());
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                if (listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        C89219l.m154716b(file2, "");
                        if (!file2.isDirectory()) {
                            m90341a(file2);
                        } else if (!arrayList.contains(file2.getName())) {
                            mo79491a(file2.getAbsolutePath());
                        }
                    }
                    C40780g.m82241a();
                }
            }
        }
    }
}
