/**
 * Copyright 2017 JessYan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package me.jessyan.art.integration.cache;

/**
 * ================================================
 * 构建 {@link Cache} 时,使用 {@link CacheType} 中声明的类型,来区分不同的模块
 * 从而为不同的模块使用不同的策略
 *
 * @see Cache.Factory#build(int)
 * Created by JessYan on 25/09/2017 18:05
 * Contact with <mailto:jess.yan.effort@gmail.com>
 * Follow me on <https://github.com/JessYanCoding>
 * ================================================
 */
public interface CacheType {
    //对应 RepositoryManager 中的容器
    int REPOSITORY_CACHE_TYPE = 0;
    int RETROFIT_SERVICE_CACHE_TYPE = 1;
    int CACHE_SERVICE_CACHE_TYPE = 2;
    //对应 AppComponent 中的 extras
    int EXTRAS_CACHE_TYPE = 3;
}
