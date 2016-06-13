package org.domeos.framework.api.service.global;

import org.domeos.framework.api.model.global.GitConfig;
import org.domeos.basemodel.HttpResponseTemp;

/**
 * Created by feiliu206363 on 2015/11/17.
 */
public interface GitConfigService {
    /**
     * git info should be set before other options
     * list all git configs in database
     *
     * @return
     */
    HttpResponseTemp<?> listGitConfigs();

    /**
     * add git config into database
     *
     * @param gitConfig can be found in api/global/GitConfig.java
     * @return
     */
    HttpResponseTemp<?> addGitConfg(GitConfig gitConfig);

    /**
     * get git config by id in database
     *
     * @param id
     * @return
     */
    HttpResponseTemp<?> getGitConfigById(int id);

    /**
     * delete git config from database by id
     *
     * @param id
     * @return
     */
    HttpResponseTemp<?> deleteGitConfigById(int id);

    /**
     * modify a git config in database by id
     *
     * @param gitConfig
     * @return
     */
    HttpResponseTemp<?> modifyGitConfig(GitConfig gitConfig);
}
