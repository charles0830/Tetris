/*
 * © 2022 Deviant Studio
 */

package ds.tetris.di

import ds.tetris.game.DesktopSoundtrack
import ds.tetris.game.Soundtrack
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

actual val platformModule: Module = module {
    singleOf(::DesktopSoundtrack) bind Soundtrack::class
}