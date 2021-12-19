package com.p2082ss.android.ugc.effectmanager.effect.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.template.CheckUpdateVersionModelTemplate;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.CheckUpdateVersionModel */
public final class CheckUpdateVersionModel extends CheckUpdateVersionModelTemplate implements Serializable {
    private final transient com.p2082ss.ugc.effectplatform.model.CheckUpdateVersionModel kUpdateModel;

    static {
        Covode.recordClassIndex(95572);
    }

    public CheckUpdateVersionModel() {
        this(null, 1, null);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.CheckUpdateVersionModelTemplate
    public final com.p2082ss.ugc.effectplatform.model.CheckUpdateVersionModel getKUpdateModel() {
        return this.kUpdateModel;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.CheckUpdateVersionModel
    public final String getCursor() {
        String cursor;
        com.p2082ss.ugc.effectplatform.model.CheckUpdateVersionModel kUpdateModel2 = getKUpdateModel();
        if (kUpdateModel2 == null || (cursor = kUpdateModel2.getCursor()) == null) {
            return super.getCursor();
        }
        return cursor;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.CheckUpdateVersionModel
    public final String getSorting_position() {
        String sorting_position;
        com.p2082ss.ugc.effectplatform.model.CheckUpdateVersionModel kUpdateModel2 = getKUpdateModel();
        if (kUpdateModel2 == null || (sorting_position = kUpdateModel2.getSorting_position()) == null) {
            return super.getSorting_position();
        }
        return sorting_position;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.CheckUpdateVersionModel
    public final String getVersion() {
        String version;
        com.p2082ss.ugc.effectplatform.model.CheckUpdateVersionModel kUpdateModel2 = getKUpdateModel();
        if (kUpdateModel2 == null || (version = kUpdateModel2.getVersion()) == null) {
            return super.getVersion();
        }
        return version;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.CheckUpdateVersionModel
    public final void setCursor(String str) {
        com.p2082ss.ugc.effectplatform.model.CheckUpdateVersionModel kUpdateModel2 = getKUpdateModel();
        if (kUpdateModel2 != null) {
            kUpdateModel2.setCursor(str);
        }
        super.setCursor(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.CheckUpdateVersionModel
    public final void setSorting_position(String str) {
        com.p2082ss.ugc.effectplatform.model.CheckUpdateVersionModel kUpdateModel2 = getKUpdateModel();
        if (kUpdateModel2 != null) {
            kUpdateModel2.setSorting_position(str);
        }
        super.setSorting_position(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.CheckUpdateVersionModel
    public final void setVersion(String str) {
        com.p2082ss.ugc.effectplatform.model.CheckUpdateVersionModel kUpdateModel2 = getKUpdateModel();
        if (kUpdateModel2 != null) {
            kUpdateModel2.setVersion(str);
        }
        super.setVersion(str);
    }

    public CheckUpdateVersionModel(com.p2082ss.ugc.effectplatform.model.CheckUpdateVersionModel checkUpdateVersionModel) {
        super(checkUpdateVersionModel);
        this.kUpdateModel = checkUpdateVersionModel;
        com.p2082ss.ugc.effectplatform.model.CheckUpdateVersionModel kUpdateModel2 = getKUpdateModel();
        if (kUpdateModel2 != null) {
            String cursor = kUpdateModel2.getCursor();
            if (cursor != null) {
                super.setCursor(cursor);
            }
            String sorting_position = kUpdateModel2.getSorting_position();
            if (sorting_position != null) {
                super.setSorting_position(sorting_position);
            }
            String version = kUpdateModel2.getVersion();
            if (version != null) {
                super.setVersion(version);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckUpdateVersionModel(com.p2082ss.ugc.effectplatform.model.CheckUpdateVersionModel checkUpdateVersionModel, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : checkUpdateVersionModel);
    }
}
