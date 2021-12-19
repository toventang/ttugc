package com.bytedance.apm.impl;

import com.bytedance.apm.p767c.p770c.C12414a;
import com.bytedance.covode.number.Covode;
import com.bytedance.services.apm.api.AbstractC22714g;
import com.bytedance.services.apm.api.IMonitorLogManager;
import java.util.List;
import org.json.JSONObject;

public class MonitorLogManagerImpl implements IMonitorLogManager {
    static {
        Covode.recordClassIndex(14306);
    }

    @Override // com.bytedance.services.apm.api.IMonitorLogManager
    public void deleteLegacyLogByIds(String str, String str2) {
    }

    @Override // com.bytedance.services.apm.api.IMonitorLogManager
    public void getLegacyLog(long j, long j2, String str, AbstractC22714g gVar) {
    }

    @Override // com.bytedance.services.apm.api.IMonitorLogManager
    public List<JSONObject> getRecentUiActionRecords() {
        return C12414a.m22354a().f30022a.f30551a;
    }
}
