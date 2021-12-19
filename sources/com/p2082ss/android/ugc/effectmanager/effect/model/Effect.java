package com.p2082ss.android.ugc.effectmanager.effect.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.Effect */
public class Effect extends EffectTemplate implements Parcelable, Serializable {
    public static final Parcelable.Creator<Effect> CREATOR = new Effect$Companion$CREATOR$1();
    public static final Companion Companion = new Companion(null);
    private final transient com.p2082ss.ugc.effectplatform.model.Effect kEffect;

    public Effect() {
        this(null, 1, null);
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.model.Effect$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(95577);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public com.p2082ss.ugc.effectplatform.model.Effect getKEffect() {
        return this.kEffect;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getAdRawData() {
        return super.getAdRawData();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public List<String> getBindIds() {
        return super.getBindIds();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getComposerParams() {
        return super.getComposerParams();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getDesignerEncryptedId() {
        return super.getDesignerEncryptedId();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getDesignerId() {
        return super.getDesignerId();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getDevicePlatform() {
        return super.getDevicePlatform();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getEffectId() {
        return super.getEffectId();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public int getEffectType() {
        return super.getEffectType();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public UrlModel getFileUrl() {
        return super.getFileUrl();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getGradeKey() {
        return super.getGradeKey();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public UrlModel getHintFile() {
        return super.getHintFile();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public int getHintFileFormat() {
        return super.getHintFileFormat();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public UrlModel getHintIcon() {
        return super.getHintIcon();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public UrlModel getIconUrl() {
        return super.getIconUrl();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getIopId() {
        return super.getIopId();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getModelNames() {
        return super.getModelNames();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getParentId() {
        return super.getParentId();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public long getPublishTime() {
        return super.getPublishTime();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getResourceId() {
        return super.getResourceId();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getSdkExtra() {
        return super.getSdkExtra();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getTagsUpdatedAt() {
        return super.getTagsUpdatedAt();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public boolean isBusiness() {
        return super.isBusiness();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public boolean isIsIop() {
        return super.isIsIop();
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public int getEffect_type() {
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            return kEffect2.getEffect_type();
        }
        return super.getEffect_type();
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public int getHint_file_format() {
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            return kEffect2.getHint_file_format();
        }
        return super.getHint_file_format();
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public long getPtime() {
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            return kEffect2.getPtime();
        }
        return super.getPtime();
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public int getSource() {
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            return kEffect2.getSource();
        }
        return super.getSource();
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public long getUse_number() {
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            return kEffect2.getUse_number();
        }
        return super.getUse_number();
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public boolean isDownloaded() {
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            return kEffect2.isDownloaded();
        }
        return super.isDownloaded();
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public boolean is_busi() {
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            return kEffect2.is_busi();
        }
        return super.is_busi();
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public boolean is_iop() {
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            return kEffect2.is_iop();
        }
        return super.is_iop();
    }

    static {
        Covode.recordClassIndex(95576);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public String getAd_raw_data() {
        String ad_raw_data;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (ad_raw_data = kEffect2.getAd_raw_data()) == null) {
            return super.getAd_raw_data();
        }
        return ad_raw_data;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public List<String> getBind_ids() {
        List<String> bind_ids;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (bind_ids = kEffect2.getBind_ids()) == null) {
            return super.getBind_ids();
        }
        return bind_ids;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public List<String> getChallenge() {
        List<String> challenge;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (challenge = kEffect2.getChallenge()) == null) {
            return super.getChallenge();
        }
        return challenge;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public List<com.p2082ss.ugc.effectplatform.model.Effect> getChild_effects() {
        List<com.p2082ss.ugc.effectplatform.model.Effect> child_effects;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (child_effects = kEffect2.getChild_effects()) == null) {
            return super.getChild_effects();
        }
        return child_effects;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public List<String> getChildren() {
        List<String> children;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (children = kEffect2.getChildren()) == null) {
            return super.getChildren();
        }
        return children;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public List<String> getComposerPath() {
        List<String> composerPath;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (composerPath = kEffect2.getComposerPath()) == null) {
            return super.getComposerPath();
        }
        return composerPath;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public String getComposer_params() {
        String composer_params;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (composer_params = kEffect2.getComposer_params()) == null) {
            return super.getComposer_params();
        }
        return composer_params;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public String getDesigner_encrypted_id() {
        String designer_encrypted_id;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (designer_encrypted_id = kEffect2.getDesigner_encrypted_id()) == null) {
            return super.getDesigner_encrypted_id();
        }
        return designer_encrypted_id;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public String getDesigner_id() {
        String designer_id;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (designer_id = kEffect2.getDesigner_id()) == null) {
            return super.getDesigner_id();
        }
        return designer_id;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public String getDevice_platform() {
        String device_platform;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (device_platform = kEffect2.getDevice_platform()) == null) {
            return super.getDevice_platform();
        }
        return device_platform;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public String getEffect_id() {
        String effect_id;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (effect_id = kEffect2.getEffect_id()) == null) {
            return super.getEffect_id();
        }
        return effect_id;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public String getExtra() {
        String extra;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (extra = kEffect2.getExtra()) == null) {
            return super.getExtra();
        }
        return extra;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public com.p2082ss.ugc.effectplatform.model.UrlModel getFile_url() {
        com.p2082ss.ugc.effectplatform.model.UrlModel file_url;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (file_url = kEffect2.getFile_url()) == null) {
            return super.getFile_url();
        }
        return file_url;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public String getGrade_key() {
        String grade_key;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (grade_key = kEffect2.getGrade_key()) == null) {
            return super.getGrade_key();
        }
        return grade_key;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public String getHint() {
        String hint;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (hint = kEffect2.getHint()) == null) {
            return super.getHint();
        }
        return hint;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public com.p2082ss.ugc.effectplatform.model.UrlModel getHint_file() {
        com.p2082ss.ugc.effectplatform.model.UrlModel hint_file;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (hint_file = kEffect2.getHint_file()) == null) {
            return super.getHint_file();
        }
        return hint_file;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public com.p2082ss.ugc.effectplatform.model.UrlModel getHint_icon() {
        com.p2082ss.ugc.effectplatform.model.UrlModel hint_icon;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (hint_icon = kEffect2.getHint_icon()) == null) {
            return super.getHint_icon();
        }
        return hint_icon;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public com.p2082ss.ugc.effectplatform.model.UrlModel getIcon_url() {
        com.p2082ss.ugc.effectplatform.model.UrlModel icon_url;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (icon_url = kEffect2.getIcon_url()) == null) {
            return super.getIcon_url();
        }
        return icon_url;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public String getId() {
        String id;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (id = kEffect2.getId()) == null) {
            return super.getId();
        }
        return id;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public String getIop_id() {
        String iop_id;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (iop_id = kEffect2.getIop_id()) == null) {
            return super.getIop_id();
        }
        return iop_id;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public String getModel_names_sec() {
        String model_names_sec;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (model_names_sec = kEffect2.getModel_names_sec()) == null) {
            return super.getModel_names_sec();
        }
        return model_names_sec;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public List<String> getMusic() {
        List<String> music;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (music = kEffect2.getMusic()) == null) {
            return super.getMusic();
        }
        return music;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public String getName() {
        String name;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (name = kEffect2.getName()) == null) {
            return super.getName();
        }
        return name;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public String getOriginal_effect_id() {
        String original_effect_id;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (original_effect_id = kEffect2.getOriginal_effect_id()) == null) {
            return super.getOriginal_effect_id();
        }
        return original_effect_id;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public String getPanel() {
        String panel;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (panel = kEffect2.getPanel()) == null) {
            return super.getPanel();
        }
        return panel;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public String getParent() {
        String parent;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (parent = kEffect2.getParent()) == null) {
            return super.getParent();
        }
        return parent;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public String getRecId() {
        String recId;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (recId = kEffect2.getRecId()) == null) {
            return super.getRecId();
        }
        return recId;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public List<String> getRequirements() {
        List<String> requirements;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (requirements = kEffect2.getRequirements()) == null) {
            return super.getRequirements();
        }
        return requirements;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public String getResource_id() {
        String resource_id;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (resource_id = kEffect2.getResource_id()) == null) {
            return super.getResource_id();
        }
        return resource_id;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public String getSchema() {
        String schema;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (schema = kEffect2.getSchema()) == null) {
            return super.getSchema();
        }
        return schema;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public String getSdk_extra() {
        String sdk_extra;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (sdk_extra = kEffect2.getSdk_extra()) == null) {
            return super.getSdk_extra();
        }
        return sdk_extra;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public String getSearchType() {
        String searchType;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (searchType = kEffect2.getSearchType()) == null) {
            return super.getSearchType();
        }
        return searchType;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public List<String> getTags() {
        List<String> tags;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (tags = kEffect2.getTags()) == null) {
            return super.getTags();
        }
        return tags;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public String getTags_updated_at() {
        String tags_updated_at;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (tags_updated_at = kEffect2.getTags_updated_at()) == null) {
            return super.getTags_updated_at();
        }
        return tags_updated_at;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public String getTransResPath() {
        String transResPath;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (transResPath = kEffect2.getTransResPath()) == null) {
            return super.getTransResPath();
        }
        return transResPath;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public com.p2082ss.ugc.effectplatform.model.UrlModel getTrans_file_url() {
        com.p2082ss.ugc.effectplatform.model.UrlModel trans_file_url;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (trans_file_url = kEffect2.getTrans_file_url()) == null) {
            return super.getTrans_file_url();
        }
        return trans_file_url;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public List<String> getTypes() {
        List<String> types;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (types = kEffect2.getTypes()) == null) {
            return super.getTypes();
        }
        return types;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public String getUnzipPath() {
        String unzipPath;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (unzipPath = kEffect2.getUnzipPath()) == null) {
            return super.getUnzipPath();
        }
        return unzipPath;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public String getZipPath() {
        String zipPath;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (zipPath = kEffect2.getZipPath()) == null) {
            return super.getZipPath();
        }
        return zipPath;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v4. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate, com.ss.android.ugc.effectmanager.effect.model.Effect] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 == null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p2082ss.android.ugc.effectmanager.effect.model.Effect> getChildEffects() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.Effect r4 = r5.getKEffect()
            if (r4 == 0) goto L_0x000c
            java.util.List r1 = r4.getChild_effects()
            if (r1 != 0) goto L_0x0010
        L_0x000c:
            java.util.List r1 = super.getChild_effects()
        L_0x0010:
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0022
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            boolean r0 = r0 instanceof com.p2082ss.android.ugc.effectmanager.effect.model.Effect
            if (r0 == 0) goto L_0x0028
        L_0x0021:
            return r1
        L_0x0022:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L_0x0021
        L_0x0028:
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = p4600h.p4601a.C89070n.m154526a(r1, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x0037:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004c
            java.lang.Object r1 = r2.next()
            com.ss.ugc.effectplatform.model.Effect r1 = (com.p2082ss.ugc.effectplatform.model.Effect) r1
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = new com.ss.android.ugc.effectmanager.effect.model.Effect
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x0037
        L_0x004c:
            java.util.List r3 = (java.util.List) r3
            if (r4 == 0) goto L_0x0053
            r4.setChild_effects(r3)
        L_0x0053:
            super.setChild_effects(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.effectmanager.effect.model.Effect.getChildEffects():java.util.List");
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setBindIds(List<String> list) {
        super.setBindIds(list);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setBusiness(boolean z) {
        super.setBusiness(z);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setEffectType(int i) {
        super.setEffectType(i);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setHintFileFormat(int i) {
        super.setHintFileFormat(i);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setIsIop(boolean z) {
        super.setIsIop(z);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setModelNames(String str) {
        super.setModelNames(str);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setParentId(String str) {
        super.setParentId(str);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setPublishTime(long j) {
        super.setPublishTime(j);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setAdRawData(String str) {
        C89219l.m154719c(str, "");
        super.setAdRawData(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setBind_ids(List<String> list) {
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setBind_ids(list);
        }
        super.setBind_ids(list);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setChallenge(List<String> list) {
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setChallenge(list);
        }
        super.setChallenge(list);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setChildren(List<String> list) {
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setChildren(list);
        }
        super.setChildren(list);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setComposerParams(String str) {
        C89219l.m154719c(str, "");
        super.setComposerParams(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setComposerPath(List<String> list) {
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setComposerPath(list);
        }
        super.setComposerPath(list);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setDesignerEncryptedId(String str) {
        C89219l.m154719c(str, "");
        super.setDesignerEncryptedId(str);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setDesignerId(String str) {
        C89219l.m154719c(str, "");
        super.setDesignerId(str);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setDevicePlatform(String str) {
        C89219l.m154719c(str, "");
        super.setDevicePlatform(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setDownloaded(boolean z) {
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setDownloaded(z);
        }
        super.setDownloaded(z);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setEffectId(String str) {
        C89219l.m154719c(str, "");
        super.setEffectId(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setEffect_type(int i) {
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setEffect_type(i);
        }
        super.setEffect_type(i);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setExtra(String str) {
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setExtra(str);
        }
        super.setExtra(str);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setFileUrl(UrlModel urlModel) {
        C89219l.m154719c(urlModel, "");
        super.setFileUrl(urlModel);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setGradeKey(String str) {
        C89219l.m154719c(str, "");
        super.setGradeKey(str);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setHintFile(UrlModel urlModel) {
        C89219l.m154719c(urlModel, "");
        super.setHintFile(urlModel);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setHintIcon(UrlModel urlModel) {
        C89219l.m154719c(urlModel, "");
        super.setHintIcon(urlModel);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setHint_file_format(int i) {
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setHint_file_format(i);
        }
        super.setHint_file_format(i);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setIconUrl(UrlModel urlModel) {
        C89219l.m154719c(urlModel, "");
        super.setIconUrl(urlModel);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setIopId(String str) {
        C89219l.m154719c(str, "");
        super.setIopId(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setModel_names_sec(String str) {
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setModel_names_sec(str);
        }
        super.setModel_names_sec(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setMusic(List<String> list) {
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setMusic(list);
        }
        super.setMusic(list);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setOriginal_effect_id(String str) {
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setOriginal_effect_id(str);
        }
        super.setOriginal_effect_id(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setParent(String str) {
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setParent(str);
        }
        super.setParent(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setPtime(long j) {
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setPtime(j);
        }
        super.setPtime(j);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setRecId(String str) {
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setRecId(str);
        }
        super.setRecId(str);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setResourceId(String str) {
        C89219l.m154719c(str, "");
        super.setResourceId(str);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setSdkExtra(String str) {
        C89219l.m154719c(str, "");
        super.setSdkExtra(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setSource(int i) {
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setSource(i);
        }
        super.setSource(i);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setTags(List<String> list) {
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setTags(list);
        }
        super.setTags(list);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setTagsUpdatedAt(String str) {
        C89219l.m154719c(str, "");
        super.setTagsUpdatedAt(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setTrans_file_url(com.p2082ss.ugc.effectplatform.model.UrlModel urlModel) {
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setTrans_file_url(urlModel);
        }
        super.setTrans_file_url(urlModel);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setUse_number(long j) {
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setUse_number(j);
        }
        super.setUse_number(j);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void set_busi(boolean z) {
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.set_busi(z);
        }
        super.set_busi(z);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void set_iop(boolean z) {
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.set_iop(z);
        }
        super.set_iop(z);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setAd_raw_data(String str) {
        C89219l.m154719c(str, "");
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setAd_raw_data(str);
        }
        super.setAd_raw_data(str);
    }

    public final void setChildEffects(List<? extends Effect> list) {
        C89219l.m154719c(list, "");
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setChild_effects(list);
        }
        super.setChild_effects(list);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setChild_effects(List<? extends com.p2082ss.ugc.effectplatform.model.Effect> list) {
        C89219l.m154719c(list, "");
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setChild_effects(list);
        }
        super.setChild_effects(list);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setComposer_params(String str) {
        C89219l.m154719c(str, "");
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setComposer_params(str);
        }
        super.setComposer_params(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setDesigner_encrypted_id(String str) {
        C89219l.m154719c(str, "");
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setDesigner_encrypted_id(str);
        }
        super.setDesigner_encrypted_id(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setDesigner_id(String str) {
        C89219l.m154719c(str, "");
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setDesigner_id(str);
        }
        super.setDesigner_id(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setDevice_platform(String str) {
        C89219l.m154719c(str, "");
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setDevice_platform(str);
        }
        super.setDevice_platform(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setEffect_id(String str) {
        C89219l.m154719c(str, "");
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setEffect_id(str);
        }
        super.setEffect_id(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setFile_url(com.p2082ss.ugc.effectplatform.model.UrlModel urlModel) {
        C89219l.m154719c(urlModel, "");
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setFile_url(urlModel);
        }
        super.setFile_url(urlModel);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setGrade_key(String str) {
        C89219l.m154719c(str, "");
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setGrade_key(str);
        }
        super.setGrade_key(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setHint(String str) {
        C89219l.m154719c(str, "");
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setHint(str);
        }
        super.setHint(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setHint_file(com.p2082ss.ugc.effectplatform.model.UrlModel urlModel) {
        C89219l.m154719c(urlModel, "");
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setHint_file(urlModel);
        }
        super.setHint_file(urlModel);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setHint_icon(com.p2082ss.ugc.effectplatform.model.UrlModel urlModel) {
        C89219l.m154719c(urlModel, "");
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setHint_icon(urlModel);
        }
        super.setHint_icon(urlModel);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setIcon_url(com.p2082ss.ugc.effectplatform.model.UrlModel urlModel) {
        C89219l.m154719c(urlModel, "");
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setIcon_url(urlModel);
        }
        super.setIcon_url(urlModel);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setId(String str) {
        C89219l.m154719c(str, "");
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setId(str);
        }
        super.setId(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setIop_id(String str) {
        C89219l.m154719c(str, "");
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setIop_id(str);
        }
        super.setIop_id(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setName(String str) {
        C89219l.m154719c(str, "");
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setName(str);
        }
        super.setName(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setPanel(String str) {
        C89219l.m154719c(str, "");
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setPanel(str);
        }
        super.setPanel(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setRequirements(List<String> list) {
        C89219l.m154719c(list, "");
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setRequirements(list);
        }
        super.setRequirements(list);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setResource_id(String str) {
        C89219l.m154719c(str, "");
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setResource_id(str);
        }
        super.setResource_id(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setSchema(String str) {
        C89219l.m154719c(str, "");
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setSchema(str);
        }
        super.setSchema(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setSdk_extra(String str) {
        C89219l.m154719c(str, "");
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setSdk_extra(str);
        }
        super.setSdk_extra(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setSearchType(String str) {
        C89219l.m154719c(str, "");
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setSearchType(str);
        }
        super.setSearchType(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setTags_updated_at(String str) {
        C89219l.m154719c(str, "");
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setTags_updated_at(str);
        }
        super.setTags_updated_at(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setTransResPath(String str) {
        C89219l.m154719c(str, "");
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setTransResPath(str);
        }
        super.setTransResPath(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setTypes(List<String> list) {
        C89219l.m154719c(list, "");
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setTypes(list);
        }
        super.setTypes(list);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setUnzipPath(String str) {
        C89219l.m154719c(str, "");
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setUnzipPath(str);
        }
        super.setUnzipPath(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.Effect
    public void setZipPath(String str) {
        C89219l.m154719c(str, "");
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setZipPath(str);
        }
        super.setZipPath(str);
    }

    public Effect(com.p2082ss.ugc.effectplatform.model.Effect effect) {
        super(effect);
        this.kEffect = effect;
        com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            String ad_raw_data = kEffect2.getAd_raw_data();
            if (ad_raw_data != null) {
                super.setAd_raw_data(ad_raw_data);
            }
            List<String> bind_ids = kEffect2.getBind_ids();
            if (bind_ids != null) {
                super.setBind_ids(bind_ids);
            }
            List<String> challenge = kEffect2.getChallenge();
            if (challenge != null) {
                super.setChallenge(challenge);
            }
            List<com.p2082ss.ugc.effectplatform.model.Effect> child_effects = kEffect2.getChild_effects();
            if (child_effects != null) {
                super.setChild_effects(child_effects);
            }
            List<String> children = kEffect2.getChildren();
            if (children != null) {
                super.setChildren(children);
            }
            List<String> composerPath = kEffect2.getComposerPath();
            if (composerPath != null) {
                super.setComposerPath(composerPath);
            }
            String composer_params = kEffect2.getComposer_params();
            if (composer_params != null) {
                super.setComposer_params(composer_params);
            }
            String designer_encrypted_id = kEffect2.getDesigner_encrypted_id();
            if (designer_encrypted_id != null) {
                super.setDesigner_encrypted_id(designer_encrypted_id);
            }
            String designer_id = kEffect2.getDesigner_id();
            if (designer_id != null) {
                super.setDesigner_id(designer_id);
            }
            String device_platform = kEffect2.getDevice_platform();
            if (device_platform != null) {
                super.setDevice_platform(device_platform);
            }
            String effect_id = kEffect2.getEffect_id();
            if (effect_id != null) {
                super.setEffect_id(effect_id);
            }
            super.setEffect_type(kEffect2.getEffect_type());
            String extra = kEffect2.getExtra();
            if (extra != null) {
                super.setExtra(extra);
            }
            com.p2082ss.ugc.effectplatform.model.UrlModel file_url = kEffect2.getFile_url();
            if (file_url != null) {
                super.setFile_url(file_url);
            }
            String grade_key = kEffect2.getGrade_key();
            if (grade_key != null) {
                super.setGrade_key(grade_key);
            }
            String hint = kEffect2.getHint();
            if (hint != null) {
                super.setHint(hint);
            }
            com.p2082ss.ugc.effectplatform.model.UrlModel hint_file = kEffect2.getHint_file();
            if (hint_file != null) {
                super.setHint_file(hint_file);
            }
            super.setHint_file_format(kEffect2.getHint_file_format());
            com.p2082ss.ugc.effectplatform.model.UrlModel hint_icon = kEffect2.getHint_icon();
            if (hint_icon != null) {
                super.setHint_icon(hint_icon);
            }
            com.p2082ss.ugc.effectplatform.model.UrlModel icon_url = kEffect2.getIcon_url();
            if (icon_url != null) {
                super.setIcon_url(icon_url);
            }
            String id = kEffect2.getId();
            if (id != null) {
                super.setId(id);
            }
            String iop_id = kEffect2.getIop_id();
            if (iop_id != null) {
                super.setIop_id(iop_id);
            }
            super.setDownloaded(kEffect2.isDownloaded());
            super.set_busi(kEffect2.is_busi());
            super.set_iop(kEffect2.is_iop());
            String model_names = kEffect2.getModel_names();
            if (model_names != null) {
                super.setModel_names(model_names);
            }
            String model_names_sec = kEffect2.getModel_names_sec();
            if (model_names_sec != null) {
                super.setModel_names_sec(model_names_sec);
            }
            List<String> music = kEffect2.getMusic();
            if (music != null) {
                super.setMusic(music);
            }
            String name = kEffect2.getName();
            if (name != null) {
                super.setName(name);
            }
            String original_effect_id = kEffect2.getOriginal_effect_id();
            if (original_effect_id != null) {
                super.setOriginal_effect_id(original_effect_id);
            }
            String panel = kEffect2.getPanel();
            if (panel != null) {
                super.setPanel(panel);
            }
            String parent = kEffect2.getParent();
            if (parent != null) {
                super.setParent(parent);
            }
            String platformVersion = kEffect2.getPlatformVersion();
            if (platformVersion != null) {
                super.setPlatformVersion(platformVersion);
            }
            super.setPtime(kEffect2.getPtime());
            String recId = kEffect2.getRecId();
            if (recId != null) {
                super.setRecId(recId);
            }
            List<String> requirements = kEffect2.getRequirements();
            if (requirements != null) {
                super.setRequirements(requirements);
            }
            List<String> requirements_sec = kEffect2.getRequirements_sec();
            if (requirements_sec != null) {
                super.setRequirements_sec(requirements_sec);
            }
            String resource_id = kEffect2.getResource_id();
            if (resource_id != null) {
                super.setResource_id(resource_id);
            }
            String schema = kEffect2.getSchema();
            if (schema != null) {
                super.setSchema(schema);
            }
            String sdk_extra = kEffect2.getSdk_extra();
            if (sdk_extra != null) {
                super.setSdk_extra(sdk_extra);
            }
            String searchType = kEffect2.getSearchType();
            if (searchType != null) {
                super.setSearchType(searchType);
            }
            super.setSource(kEffect2.getSource());
            List<String> tags = kEffect2.getTags();
            if (tags != null) {
                super.setTags(tags);
            }
            String tags_updated_at = kEffect2.getTags_updated_at();
            if (tags_updated_at != null) {
                super.setTags_updated_at(tags_updated_at);
            }
            String transResPath = kEffect2.getTransResPath();
            if (transResPath != null) {
                super.setTransResPath(transResPath);
            }
            com.p2082ss.ugc.effectplatform.model.UrlModel trans_file_url = kEffect2.getTrans_file_url();
            if (trans_file_url != null) {
                super.setTrans_file_url(trans_file_url);
            }
            List<String> types = kEffect2.getTypes();
            if (types != null) {
                super.setTypes(types);
            }
            List<String> types_sec = kEffect2.getTypes_sec();
            if (types_sec != null) {
                super.setTypes_sec(types_sec);
            }
            String unzipPath = kEffect2.getUnzipPath();
            if (unzipPath != null) {
                super.setUnzipPath(unzipPath);
            }
            super.setUse_number(kEffect2.getUse_number());
            String zipPath = kEffect2.getZipPath();
            if (zipPath != null) {
                super.setZipPath(zipPath);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate, com.p2082ss.ugc.effectplatform.model.Effect
    public void writeToParcel(Parcel parcel, int i) {
        C89219l.m154719c(parcel, "");
        if (getKEffect() != null) {
            com.p2082ss.ugc.effectplatform.model.Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.writeToParcel(parcel, i);
                return;
            }
            return;
        }
        super.writeToParcel(parcel, i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Effect(com.p2082ss.ugc.effectplatform.model.Effect effect, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : effect);
    }
}
