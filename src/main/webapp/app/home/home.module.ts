import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { SallefySharedModule } from 'app/shared/shared.module';
import { HOME_ROUTE } from './home.route';
import { HomeComponent } from './home.component';
import { TracksComponent } from './sections/tracks/tracks.component';
import { PlaylistsComponent } from './sections/playlists/playlists.component';

@NgModule({
  imports: [SallefySharedModule, RouterModule.forChild([HOME_ROUTE])],
  declarations: [TracksComponent, HomeComponent, PlaylistsComponent]
})
export class SallefyHomeModule {}
